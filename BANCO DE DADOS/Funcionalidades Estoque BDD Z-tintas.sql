-- Inserindo dados na tabela de produtos
INSERT INTO tb_produto (nome_produto, cod_hex, marca, quantidade, preco) VALUES
('Tinta Acrílica Branca', 'FFFFFF', 'Suvinil', 50, 89.90),
('Tinta Esmalte Azul', '0000FF', 'Coral', 30, 75.50),
('Tinta Látex Verde', '00FF00', 'Sherwin-Williams', 20, 68.00);

-- Inserindo dados na tabela de funcionários
INSERT INTO tb_funcionario (nome, cargo) VALUES
('João da Silva', 'Vendedor'),
('Maria Oliveira', 'Caixa');

-- Inserindo dados na tabela de clientes
INSERT INTO cliente (nome, dt_nascimento, cpf, cnpj, cep, uf, cidade, rua, numero) VALUES
('Carlos Souza', '1985-07-15', '12345678900', '12345678000199', '01310930', 'SP', 'São Paulo', 'Av. Paulista', '1000'),
('Fernanda Lima', '1990-03-22', '98765432100', '98765432000188', '20040002', 'RJ', 'Rio de Janeiro', 'Rua do Ouvidor', '250');

-- Inserindo dados na tabela de vendas
INSERT INTO tb_venda (nfe, preco_total, id_produto, id_funcionario) VALUES
('NFE001', 179.80, 1, 1),
('NFE002', 75.50, 2, 2);

-- Inserindo dados na tabela produto_venda
INSERT INTO tb_produto_venda (quantidade_venda, produto_id_produto, venda_id_produto) VALUES
(2, 1, 1),
(1, 2, 2);

-- --------------------------------------------------- --

-- 1. Criar tabela de movimentações de estoque (tb_estoque_movimento) --
CREATE TABLE tb_estoque_movimento (
    id_movimento INT PRIMARY KEY AUTO_INCREMENT,
    tipo_movimento ENUM('ENTRADA', 'SAIDA') NOT NULL,
    quantidade INT NOT NULL,
    data_movimento DATETIME DEFAULT CURRENT_TIMESTAMP,
    produto_id INT,
    FOREIGN KEY (produto_id) REFERENCES tb_produto(id_produto)
);
-- 2. Criar procedure para registrar entrada no estoque --
DELIMITER //

CREATE PROCEDURE registrar_entrada_estoque (
    IN produto INT,
    IN qtd INT
)
BEGIN
    UPDATE tb_produto
    SET quantidade = quantidade + qtd
    WHERE id_produto = produto;

    INSERT INTO tb_estoque_movimento (tipo_movimento, quantidade, produto_id)
    VALUES ('ENTRADA', qtd, produto);
END //

DELIMITER ;

-- 3. Criar procedure para registrar saída no estoque (venda) --
DELIMITER //

CREATE PROCEDURE registrar_saida_estoque (
    IN produto INT,
    IN qtd INT
)
BEGIN
    DECLARE estoque_atual INT;

    SELECT quantidade INTO estoque_atual
    FROM tb_produto
    WHERE id_produto = produto;

    IF estoque_atual >= qtd THEN
        UPDATE tb_produto
        SET quantidade = quantidade - qtd
        WHERE id_produto = produto;

        INSERT INTO tb_estoque_movimento (tipo_movimento, quantidade, produto_id)
        VALUES ('SAIDA', qtd, produto);
    ELSE
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Estoque insuficiente!';
    END IF;
END //

DELIMITER ;
