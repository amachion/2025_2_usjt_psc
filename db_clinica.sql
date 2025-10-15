create database db_clinica;
use db_clinica;

create table tb_pessoa (
	cpf char(11) primary key,
    nome varchar(100)
);
-- CREATE TABLE `tb_pessoa` (
--   `cpf` char(11) NOT NULL,
--   `nome` varchar(100) DEFAULT NULL,
--   PRIMARY KEY (`cpf`)
-- ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

create table tb_medico (
	crm varchar(10),
    nome varchar(100), 
    especialidade varchar(100),
    primary key (crm)
);

create table tb_consulta (
	cpf char(11) not null,
    crm varchar(10) not null,
    data_consulta date,
    primary key (cpf, crm, data_consulta),
    constraint fk_cpf_pessoa 
		foreign key (cpf) references tb_pessoa (cpf),
	constraint fk_crm_medico
		foreign key (crm) references tb_medico (crm)
);
    
insert into tb_pessoa values
	('12345678901', 'Roberto Carlos'),
    ('34567890123', 'Alcione');
select * from tb_pessoa;
select nome from tb_pessoa;
-- problema de inserção com chave nula
-- insert into tb_pessoa (nome) values ('joao');

insert into tb_medico values
	('12345', 'Joao Fernandes', 'cardiologista'),
    ('34567', 'Bruno Silva', 'dematologista');
update tb_medico 
	set especialidade = 'dermatologista' 
    where crm = '34567'; 
select * from tb_medico;

insert into tb_medico values ('76543', 'Ana Clara', 'cardiologista');

select especialidade from tb_medico; -- traz os dados com repetição
select distinct especialidade from tb_medico; -- sem repetições

select nome
	from tb_medico
    where especialidade = 'cardiologista';
    
insert into tb_consulta values
	('12345678901', '12345', '2025-09-23');
    
select * from tb_consulta;

-- insert into tb_consulta values
--    ('12345678902', '12346', '2025-10-14');

-- os nomes das pessoas e dos médicos que tiveram consultas juntos

select 
	p.nome as nome_paciente,
	m.nome as nome_medico,
    c.data_consulta
from 
	tb_pessoa as p,
    tb_medico as m, 
    tb_consulta as c
where
	c.cpf = p.cpf 
and 
	c.crm = m.crm;
    
-- a mesma consulta utilizando join
select 
	p.nome as nome_paciente,
    m.nome as nome_medico,
    c.data_consulta
from
	tb_consulta c
    JOIN tb_pessoa p ON c.cpf = p.cpf
    JOIN tb_medico m ON c.crm = m.crm;
    
-- contar o numero de registros de uma tabela

select count(*) as total_pacientes from tb_pessoa;

select especialidade, count(*) as especialidades 
from tb_medico
group by especialidade;