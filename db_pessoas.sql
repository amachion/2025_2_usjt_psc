-- criar um banco de dados
create database db_pessoas;
-- tornar o banco ativo
use db_pessoas;
-- para apagar um banco
drop database db_pessoas;
-- criar a tabela pessoa (codigo, nome, tel, email)
create table tb_pessoa (
	codigo int primary key auto_increment,
    -- auto_increment não se repete e segue uma sequência interna do SGBD
    nome varchar(40),
    tel varchar(20),
    email varchar(100)
);
-- inserir uma pessoa na tabela tb_pessoa
insert into 
	tb_pessoa (nome, tel, email)
    values ('Rui Barbosa', '11223344', 'rui@email.com');
-- consultar valores na tabela

select * from tb_pessoa;

insert into tb_pessoa (nome, tel, email) values
	('Jose de Alencar', '22334455', 'jose@email.com'),
    ('Machado de Assis', '33445566', 'machado@email.com');

-- atualização de dados de uma tabela
-- update tabela set (o dado = novo valor) where condição válida
update tb_pessoa set nome = 'Joao Ubaldo Ribeiro' where codigo = 1; 

-- apagar um conjunto de dados
-- delete from tabela where condição válida
delete from tb_pessoa where codigo = 2; 

insert into tb_pessoa (nome, email, tel) 
	values ('Monteiro Lobato', 'lobato@email.com', '88776655');
    
-- erro, inserção em auto_increment
-- insert into tb_pessoa (10, 'Clarice Lispector', '55667788', 'clarice@email.com');

create table tb_conta (
	numero int primary key,
    saldo decimal -- vai truncar o valor sem casas decimais
);

insert into tb_conta values 
(300, 350.45),
(400, 1050.75);

select * from tb_conta;

-- removendo coluna saldo
alter table tb_conta 
	drop column saldo;
alter table tb_conta
	add column saldo decimal(2);
    
alter table tb_conta 
	modify column saldo decimal(12, 2);
    
update tb_conta set saldo = 12.45 where numero = 100;
update tb_conta set saldo = 102.50 where numero = 200;
