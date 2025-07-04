create database Z_tintas;

use Z_tintas;

create table tb_produto(
	id_produto int primary key auto_increment,
	nome_produto varchar(45) not null,
	cod_hex varchar(6) unique,
	marca varchar(45) not null,
	/*quantidade int not null,*/
	preco double(7,2) not null
);

CREATE TABLE tb_funcionario(
	id_funcionario  int primary key auto_increment ,
	nome VARCHAR(45),
	cargo VARCHAR(45),
    senha VARCHAR(45)
);

CREATE TABLE tb_produto_venda(
	quantidade_venda INT,
	produto_id_produto INT,
	venda_id_produto INT
);

create table tb_venda(
	id_venda int primary key auto_increment,
    nfe varchar(45) unique not null,
    preco_total double(7,2) not null,
    id_produto int ,
    id_funcionario int,
    foreign key (id_produto) references tb_produto(id_produto),
    foreign key (id_funcionario) references tb_funcionario(id_funcionario)
    );
    
create table cliente(
	id_cliente int primary key auto_increment,
    nome varchar(45) not null,
    dt_nascimento date not null,
    cpf varchar(11) not null unique,
    telefone varchar(45) not null,
    cep varchar(8) not null,
    uf char(2) not null,
    cidade varchar(45) not null,
    rua varchar(45) not null,
    numero varchar(45) not null,
    bairro varchar(45) 
);
    
select * from cliente;
INSERT INTO tb_funcionario (nome,cargo,senha) VALUES ("MATHEUS TARGA","DESENVOLVEDOR","123");

insert into tb_funcionario(nome,cargo,senha) values ("fer","adm","123");






