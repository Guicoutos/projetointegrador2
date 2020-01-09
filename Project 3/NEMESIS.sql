create database NEMESIS;
use NEMESIS;
create table tbusuarios(
iduser int primary key auto_increment,
nome varchar(50) not null,
telefone varchar(15),
cpf varchar(15) not null unique,
senha varchar(15) not null,
cargo int not null
);
-- cargo = 1 = adm | cargo = 2 = comum
-- Add usuários \/
describe tbusuarios;
insert into tbusuarios(nome,telefone,cpf,senha,cargo)
values('Fulano','9999-9999','123.567.911-23','123',1);
insert into tbusuarios(nome,telefone,cpf,senha,cargo)
values('Cicrano','8888-8888','111.111.111-11','1',2);
insert into tbusuarios(nome,telefone,cpf,senha,cargo)
values('Beutrano','7777-7777','555.444.333-22','2',2);
insert into tbusuarios(nome,telefone,cpf,senha,cargo)
values('Acabou as ideias de nomes','6666-6666','999.888.777-66','3',2);
select * from tbusuarios;
-- Atualizando as informações de um usuário \/
update tbusuarios set  telefone='2584-7642' where iduser=2;
select * from tbusuarios;
-- Deletando um usuario \/
delete from tbusuarios where iduser=3;
select * from tbusuarios;

create table tbclientes(
idcli int primary key auto_increment,
nomecli varchar(50) not null,
cpfcli varchar(15) not null unique,
emailcli varchar(50) not null
);
describe tbclientes;
insert into tbclientes(nomecli,cpfcli,emailcli)
values('Cliente1','159.753.852-46','generico@gmail.com');
insert into tbclientes(nomecli,cpfcli,emailcli)
values('Cliente2','159.753.852-47','generico2@gmail.com');
insert into tbclientes(nomecli,cpfcli,emailcli)
values('Cliente3','159.753.852-48','generico3@gmail.com');
insert into tbclientes(nomecli,cpfcli,emailcli)
values('Cliente4','159.753.852-49','generico4@gmail.com');
insert into tbclientes(nomecli,cpfcli,emailcli)
values('Cliente5','159.753.852-50','generico5@gmail.com');
select * from tbclientes;

create table tbvenda(
idvenda int primary key auto_increment,
datavenda timestamp default current_timestamp,
produtos varchar (3000) not null,
valor decimal(10,2),
idcli int,
foreign key(idcli) references tbclientes(idcli)
);
select * from tbvenda;
insert into tbvenda(produtos,valor,idcli)
values('produto 1, produto 2, produto 3, produto 4, produto 5, produto 6, produto 7, 
produto 8, produto 9, produto 10, produto 11, produto 12, produto 13, produto 14, produto 15, 
produto 16, produto 17, produto 18, produto 19, produto 20, produto 21, produto 22, 
produto 23, produto 24, produto 25, ','79.89','2');
select * from tbvenda;
