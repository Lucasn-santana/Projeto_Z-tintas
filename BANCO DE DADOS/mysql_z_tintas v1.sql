create database Z_tintas;

use Z_tintas;

create table tb_produto(
	id_produto int primary key auto_increment,
	nome_produto varchar(45) not null,
	cod_hex varchar(6) unique,
	marca varchar(45) not null,
	quantidade int not null,
	preco double(7,2) not null
);




drop table tb_produto;




create table tb_venda(
	id_venda int primary key auto_increment,
    nfe varchar(45) unique not null,
    preco_total double(7,2) not null,
    id_produto int ,
    id_funcionario int,
    foreign key (id_produto) references tb_produto(id_produto),
    foreign key (id_funcionario) references tb_funcionario(id_funcionario)
    );
    






