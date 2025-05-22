create database Z_tintas;

use Z_tintas;

create table tb_produto(
id_produto int primary key auto_increment,
nome_produto varchar(45),
cod_hex varchar(6) unique,
marca varchar(45),
quantidade int,
preco double(7,2)
);

CREATE TABLE tb_funcionario(
id_fucnionario INT,
nome VARCHAR(45),
cargo VARCHAR(45),
);

CREATE TABLE tb_produto_venda(
quantidade_venda INT,
produto_id_produto INT,
venda_id_produto INT
);







drop table tb_produto;