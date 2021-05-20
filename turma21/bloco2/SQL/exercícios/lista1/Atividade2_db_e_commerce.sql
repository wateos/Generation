create database db_e_commerce;

use db_e_commerce;

create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
marca varchar(255) not null,
tipo varchar(255) not null,
preço float not null,
primary key(id)
);

insert into tb_produtos (nome,marca,tipo,preço) values ("Vassoura","MAX","Limpeza",50.00);
insert into tb_produtos (nome,marca,tipo,preço) values ("Peru","Sadia","Alimentício",40.00);
insert into tb_produtos (nome,marca,tipo,preço) values ("Linguíça","Sadia","Alimentício",30.00);
insert into tb_produtos (nome,marca,tipo,preço) values ("K10","LG","Eletronico",800.00);
insert into tb_produtos (nome,marca,tipo,preço) values ("Máquina de lavar","eletrolux","Eletrodoméstico",400.00);
insert into tb_produtos (nome,marca,tipo,preço) values ("Liquidificador","eletrolux","Eletrodoméstico",200.00);
insert into tb_produtos (nome,marca,tipo,preço) values ("Ferro de passar","eletrolux","Eletrodoméstico",150.00);
insert into tb_produtos (nome,marca,tipo,preço) values ("S5","Samsung","Eletronico",700.00);

select * from tb_produtos where preço > 500;
select * from tb_produtos where preço < 500;

update tb_produtos set preço = 5.00 where id = 1;

select * from tb_produtos;

drop table tb_produtos;
drop database db_e_commerce;