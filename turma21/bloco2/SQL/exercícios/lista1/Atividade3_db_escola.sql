create database db_escola;

use db_escola;

create table tb_alunes(
matricula bigint auto_increment,
nome varchar(255) not null,
turma varchar(255) not null,
idade int not null,
nota float not null,
primary key(matricula)
);

insert into tb_alunes (nome,turma,idade,nota) values ("Marcelo","21C",18,5.00);
insert into tb_alunes (nome,turma,idade,nota) values ("Marcos","22B",19,6.00);
insert into tb_alunes (nome,turma,idade,nota) values ("Afonso","23A",20,7.00);
insert into tb_alunes (nome,turma,idade,nota) values ("Tiago","21C",25,8.00);
insert into tb_alunes (nome,turma,idade,nota) values ("Isabela","21C",17,9.00);
insert into tb_alunes (nome,turma,idade,nota) values ("Joabe","22B",15,10.00);
insert into tb_alunes (nome,turma,idade,nota) values ("Katyucia","23A",30,4.00);
insert into tb_alunes (nome,turma,idade,nota) values ("Valeria","23A",18,3.00);

select * from tb_alunes where nota > 7.00;
select * from tb_alunes where nota < 7.00;

update tb_alunes set nota = 6.00 where matricula = 7;
update tb_alunes set nota = 6.00 where matricula = 8;

select * from tb_alunes;

drop table tb_alunes;
drop database db_escola;