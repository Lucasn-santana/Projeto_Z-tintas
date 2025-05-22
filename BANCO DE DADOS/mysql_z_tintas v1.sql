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





drop table tb_produto;