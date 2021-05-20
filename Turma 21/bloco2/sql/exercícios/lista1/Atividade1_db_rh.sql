create database db_rh;

use db_rh;

create table tb_funcionaries(
cpf bigint not null,
nome varchar(255) not null,
cargo varchar(255) not null,
idade int not null,
salário float not null,
primary key(cpf)
);

insert into tb_funcionaries (cpf,nome,cargo,idade,salário) values (123456,"Maria","Gerente de TI",25,7000.00);
insert into tb_funcionaries (cpf,nome,cargo,idade,salário) values (234567,"João","Gerente de projeto",30,5000.00);
insert into tb_funcionaries (cpf,nome,cargo,idade,salário) values (345678,"Carlos","Programador",20,1800.00);
insert into tb_funcionaries (cpf,nome,cargo,idade,salário) values (456789,"Mateus","Programador",22,3000.00);
insert into tb_funcionaries (cpf,nome,cargo,idade,salário) values (5678910,"Tiago","Programador",18,1500.00);

select * from tb_funcionaries where salário > 2000;
select * from tb_funcionaries where salário < 2000;

update tb_funcionaries set salário = 3000.00 where cpf = 345678 ;
update tb_funcionaries set salário = 3000.00 where cpf = 5678910 ;

select * from tb_funcionaries;

drop table tb_funcionaries;
drop database db_rh;