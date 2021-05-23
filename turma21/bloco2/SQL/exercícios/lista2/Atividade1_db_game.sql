create database db_generation_game_online;

use db_generation_game_online;

create table tb_classe(
id bigint auto_increment,
descrição varchar(255) not null,
mágica boolean,
alcanse int,
primary key(id)
);

insert into tb_classe(descrição,mágica,alcanse) values ("Lutador",false,1);
insert into tb_classe(descrição,mágica,alcanse) values ("arqueiro",false,30);
insert into tb_classe(descrição,mágica,alcanse) values ("Mago",true,20);
insert into tb_classe(descrição,mágica,alcanse) values ("Bruxo",true,15);
insert into tb_classe(descrição,mágica,alcanse) values ("Monge",true,2);

select * from tb_classe;

create table tb_personagem(
id bigint auto_increment,
nome varchar(255) not null,
defesa bigint,
ataque bigint,
vida bigint,
classe_id bigint,
primary key(id),
foreign key (classe_id) references tb_classe (id)
);

insert into tb_personagem (nome,defesa,ataque,vida,classe_id) values ("Shazam",200, 3000, 200,3);
insert into tb_personagem (nome,defesa,ataque,vida,classe_id) values ("Legolas",1000,2000,300,2);
insert into tb_personagem (nome,defesa,ataque,vida,classe_id) values ("Wanda",250,2800,250,4);
insert into tb_personagem (nome,defesa,ataque,vida,classe_id) values ("Diana",3000,2500,400,1);
insert into tb_personagem (nome,defesa,ataque,vida,classe_id) values ("Lee",2000,1500,500,5);
insert into tb_personagem (nome,defesa,ataque,vida,classe_id) values ("Clark",3000,2500,400,1);
insert into tb_personagem (nome,defesa,ataque,vida,classe_id) values ("Valquiria",3000,2500,400,1);
insert into tb_personagem (nome,defesa,ataque,vida,classe_id) values ("Zatana",200, 3000, 200,3);

select * from tb_personagem where ataque > 2000;
select *
from tb_personagem
where defesa between 1000 and 2000;
select * from tb_personagem where nome like "%C%";

select nome, defesa, ataque, vida ,descrição, mágica, alcanse
 from tb_personagem inner join tb_classe on  tb_classe.id = tb_personagem.classe_id;

select nome, defesa, ataque, vida ,descrição, mágica, alcanse
 from tb_personagem inner join tb_classe on  tb_classe.id = tb_personagem.classe_id
 where descrição = "mago";

drop table tb_personagem;
drop database db_generation_game_online;