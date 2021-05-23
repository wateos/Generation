-- Criar  um banco de dados
create database db_quitanda;

-- acessa o banco de dados
use db_quitanda;

-- criar tabela
create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
preco float not null,
primary key(id)
);

-- inserir uma informação na tabela
insert into tb_produtos (nome,preco) values ("mamao",2.50);
insert into tb_produtos (nome,preco) values ("laranja",1.50);
insert into tb_produtos (nome,preco) values ("melancia",10.50);
insert into tb_produtos (nome,preco) values ("uva",1.50);
-- buscar um produto
select * from tb_produtos where preco> 3;
select * from tb_produtos;

-- adicionando coluna ou atributo
alter table tb_produtos add descricao varchar(255);

-- excluindo coluno ou atributo
alter table tb_produtos drop descricao;

-- Excluíndo um registro ou linha
delete from tb_produtos where id = 2;

-- Atualização de registros
update tb_produtos set preco = 10 where id = 3;
update tb_produtos set nome = "uva";

-- excluindo tabela e banco de dados
drop table tb_produtos;
drop database db_quitanda;