create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
id bigint auto_increment,
descrição varchar(255) not null,
produtor varchar(255) not null,
tel varchar(255) not null,
primary key(id)
);

insert into tb_categoria(descrição,produtor,tel) values ("Medicamento Genérico","XWZ","5252-7878");
insert into tb_categoria(descrição,produtor,tel) values ("Medicamento de referencia","ABC","2323-4545");
insert into tb_categoria(descrição,produtor,tel) values ("Produto Alimentício","XRP","3030-2121");
insert into tb_categoria(descrição,produtor,tel) values ("Produto Eletrônico","REletro","1212-9090");
insert into tb_categoria(descrição,produtor,tel) values ("Produto Cosmético","LLC","5656-8989");

select * from tb_categoria;

create table tb_produto(
id bigint auto_increment,
nome varchar(255) not null,
receita_medica boolean,
cosmético boolean,
valor double,
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_produto (nome,receita_medica,valor,cosmético,categoria_id) values ("Batom",false, 2.00 , true,5);
insert into tb_produto (nome,receita_medica,valor,cosmético,categoria_id) values ("Barra de ceral",false,3.00,false,3);
insert into tb_produto (nome,receita_medica,valor,cosmético,categoria_id) values ("Inalador",false,200.00,false,4);
insert into tb_produto (nome,receita_medica,valor,cosmético,categoria_id) values ("Roacutan",true,300.00,false,2);
insert into tb_produto (nome,receita_medica,valor,cosmético,categoria_id) values ("Creme",false,50.00,true,5);
insert into tb_produto (nome,receita_medica,valor,cosmético,categoria_id) values ("Isotretinoina",true, 80.00 , false,1);
insert into tb_produto (nome,receita_medica,valor,cosmético,categoria_id) values ("Aspirina",true, 60.00,false,2);
insert into tb_produto (nome,receita_medica,valor,cosmético,categoria_id) values ("Aspirina",true, 30.00, false,1);

select * from tb_produto where valor > 50.00;
select *
from tb_produto
where valor between 3 and 60;
select * from tb_produto where nome like "%B%";

select nome, receita_medica, valor, cosmético ,descrição, produtor, tel
 from tb_produto inner join tb_categoria on  tb_categoria.id = tb_produto.categoria_id;

select nome, receita_medica, valor, cosmético ,descrição, produtor, tel
 from tb_produto inner join tb_categoria on  tb_categoria.id = tb_produto.categoria_id
 where cosmético like true;

drop table tb_produto;
drop table tb_categoria;
drop database db_farmacia_do_bem;