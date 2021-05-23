create database db_cidade_das_frutas;

use db_cidade_das_frutas;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key (id)
);

insert into tb_categoria (descricao, ativo) values ("Fruta", true);
insert into tb_categoria (descricao, ativo) values ("Legumes",true);
insert into tb_categoria (descricao, ativo) values ("Raiz",true);
insert into tb_categoria (descricao, ativo) values ("Folha",true);
insert into tb_categoria (descricao, ativo) values ("Grão",true);
insert into tb_categoria (descricao, ativo) values ("outros",true);

create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
preco float not null,
qtProduto int not null,
categoria_id bigint,
primary key (id),
foreign key (categoria_id) references tb_categoria (id)
);

insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Melância",18.00,1,1);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Melão Yubari",800.00,1,1);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Abobora",8.90,1,2);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Batata doce",20.00,4,3);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Ora pro nobis",60.00,1,4);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Mandioca",20.00,4,3);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Tremoço Português Grande",3.00,1,5);
insert tb_produtos (nome, preco, qtProduto, categoria_id) values ("Dente de Leão",1.99,10,6);

select * from tb_produtos where  preco > 50;
select * from tb_produtos where nome like "D%";
select *
from tb_produtos
where preco between 3 and 60;

-- Join: união de tabelas para consultas
select nome, preco, qtProduto, tb_categoria.descricao as descricao_da_categoria ,tb_categoria.ativo as estado_da_categoria
 from tb_produtos inner join tb_categoria on  tb_categoria.id = tb_produtos.categoria_id;
 
select nome, preco, qtProduto, tb_categoria.descricao as descricao_da_categoria ,tb_categoria.ativo as estado_da_categoria
 from tb_produtos inner join tb_categoria on  tb_categoria.id = tb_produtos.categoria_id
 where descricao like "Fruta";

drop table tb_produtos;
drop table tb_categoria;
drop database db_cidade_das_frutas;