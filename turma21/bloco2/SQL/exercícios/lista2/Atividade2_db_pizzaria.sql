create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
id bigint auto_increment,
salgada boolean,
doce boolean,
especial boolean,
preço double,
primary key(id)
);

insert into tb_categoria(salgada,doce,especial, preço) values (true,false,false, 27.00);
insert into tb_categoria(salgada,doce,especial, preço) values (true,false,true, 50.00);
insert into tb_categoria(salgada,doce,especial, preço) values (false,true,false, 20.00);
insert into tb_categoria(salgada,doce,especial, preço) values (false,true,true, 40.00);
insert into tb_categoria(salgada,doce,especial, preço) values (true,true,false, 25.00);
insert into tb_categoria(salgada,doce,especial, preço) values (true,true,true, 45.00);

select * from tb_categoria;

create table tb_pizza(
id bigint auto_increment,
nome varchar(255) not null,
borda boolean,
massa_grossa boolean,
especiarias boolean,
categoria_id bigint,
primary key(id),
foreign key (categoria_id) references tb_categoria (id)
);

insert into tb_pizza (nome,borda,massa_grossa,especiarias,categoria_id) values ("mussarela",true, false, true,1);
insert into tb_pizza (nome,borda,massa_grossa,especiarias,categoria_id) values ("calabresa",true,true,true,1);
insert into tb_pizza (nome,borda,massa_grossa,especiarias,categoria_id) values ("mussarela especial",false,false,false,2);
insert into tb_pizza (nome,borda,massa_grossa,especiarias,categoria_id) values ("calabresa especial",false,false,false,2);
insert into tb_pizza (nome,borda,massa_grossa,especiarias,categoria_id) values ("Brigadeiro",true,false,false,3);
insert into tb_pizza (nome,borda,massa_grossa,especiarias,categoria_id) values ("Goiabada",true,false,false,3);
insert into tb_pizza (nome,borda,massa_grossa,especiarias,categoria_id) values ("Brigadeiro especial",true,false,false,4);
insert into tb_pizza (nome,borda,massa_grossa,especiarias,categoria_id) values ("Goiabada especial",true,false,false,4);
insert into tb_pizza (nome,borda,massa_grossa,especiarias,categoria_id) values ("Goiabada com mussarela",true,false,false,5);
insert into tb_pizza (nome,borda,massa_grossa,especiarias,categoria_id) values ("Goiabada com mussarela especial",true,false,false,6);

select nome, borda, massa_grossa, especiarias ,salgada, doce, especial, preço
 from tb_pizza inner join tb_categoria on  tb_categoria.id = tb_pizza.categoria_id
 where preço > 45.00;
 
select nome, borda, massa_grossa, especiarias ,salgada, doce, especial, preço
 from tb_pizza inner join tb_categoria on  tb_categoria.id = tb_pizza.categoria_id
 where preço between 29.00 and 60.00;
 
select nome, borda, massa_grossa, especiarias ,salgada, doce, especial, preço
 from tb_pizza inner join tb_categoria on  tb_categoria.id = tb_pizza.categoria_id
 where nome like "%C%"; 
 
select nome, borda, massa_grossa, especiarias ,salgada, doce, especial, preço
 from tb_pizza inner join tb_categoria on  tb_categoria.id = tb_pizza.categoria_id;

select nome, borda, massa_grossa, especiarias ,salgada, doce, especial, preço
 from tb_pizza inner join tb_categoria on  tb_categoria.id = tb_pizza.categoria_id
 where doce like true;

drop table tb_categoria;
drop table tb_pizza;
drop database db_generation_game_online;