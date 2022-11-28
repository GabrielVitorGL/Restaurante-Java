
-- Breno Jefferson, Gabriel Vitor e Vinicius de Souza

create database anopassadoBD
use anopassadoBD

drop table Cliente
drop table Pedido
drop table Funcionario
drop table NotaFiscal
drop table Bebida
drop table Prato

create table Cliente(cpf_clie numeric(11) primary key,
                     nome_clie varchar(60) not null,
                     email_clie varchar(100) not null,
                     endereco_clie varchar(50) not null,
                     telefone_clie numeric(11) not null
)

create table Bebida(cod_beb numeric(6) primary key,
                    nome_beb varchar(40) not null,
					tam_beb varchar(15) not null,
                    valor_beb numeric(8,2) not null
)


create table Prato(cod_prato numeric(6) primary key,
                   nome_prato varchar(50) not null,
				   tam_prato varchar(20) not null,
				   valor_prato numeric(8,2) not null
)

create table Funcionario(cpf_fun numeric(11) primary key,
                         nome_fun varchar(50) not null,
                         endereco_fun varchar(50) not null,
                         email_fun varchar(100) not null,
                         telefone_fun numeric(11) not null,
						 salario_fun numeric(8,2) not null
)

create table Pedido(num_ped numeric(6) primary key,
                    dt_ped date not null,
                    horario_ped varchar(5) not null,
                    cpf_clie numeric(11) CONSTRAINT cpf_clie_ped foreign key references Cliente not null,
					cod_beb numeric(6) CONSTRAINT cod_beb_ped foreign key references Bebida,
					cod_prato numeric(6) CONSTRAINT cod_prato_ped foreign key references Prato,
					cpf_fun numeric(11) CONSTRAINT cpf_fun_ped foreign key references Funcionario
					)

create table NotaFiscal(cod numeric(6) primary key,
                        valortotal numeric(8,2) not null,
                        forma_pag varchar(20) not null,
                        dt_emi date not null,
                        cpf_clie numeric(11) CONSTRAINT cpf_clie_nf foreign key references Cliente,
                        num_ped numeric(6) CONSTRAINT num_ped_nf foreign key references Pedido
)


insert into Cliente values(12345678910, 'Adeilton Santos', 'adeilton@gmail.com', 'Rua Ariston de Azevedo', 11988573957)
insert into Cliente values(12345678911, 'Gabriel Santos', 'gabriel@gmail.com', 'Rua João Alves', 11988573257)
insert into Cliente values(12345678912, 'Naldo Souza', 'naldo@gmail.com', 'Av. Paulista', 11987673957)
insert into Cliente values(12345678913, 'Matheus Oliveira', 'mattheus@gmail.com', 'Av. Paulo Freire', 11982273957)
insert into Cliente values(12345678914, 'Ana Mendes', 'anamendes@gmail.com', 'Rua Cristovão Colombo', 11988443957)

insert into Bebida values(1, 'Sprite', 'Grande', 14.00)
insert into Bebida values(2, 'Coca Cola', 'Pequena', 13.00)
insert into Bebida values(3, 'Fanta uva', 'Grande', 12.00)
insert into Bebida values(4, 'Kuat', 'Média', 11.00)
insert into Bebida values(5, 'Convenção', 'Pequena', 10.00)


insert into Prato values(1, 'Escondinho', 'Grande', 14.00)
insert into Prato values(2, 'Carne com batata', 'Pequena', 13.00)
insert into Prato values(3, 'Parmediana', 'Grande', 12.00)
insert into Prato values(4, 'Strogonoff', 'Média', 11.00)
insert into Prato values(5, 'Milanesa', 'Pequena', 10.00)

insert into Funcionario values(12345678901, 'Arnaldo Junior', 'Rua Guilherme', 'junindazn@gmail.com', 11923443251, 2466.23)
insert into Funcionario values(12345678902, 'Dilma Souza', 'Rua Armando', 'dilminha@gmail.com' , 11923443250,1432.23)
insert into Funcionario values(12345678903, 'SolangeEvelin', 'Rua Breno Jeff', 'solangeevelin@gmail.com', 11923443252, 5432.23)
insert into Funcionario values(12345678904, 'Wagner Clares', 'Av. Josino', 'wclares@gmail.com' ,11923443253, 6432.23)
insert into Funcionario values(12345678905, 'Isabelle Gomes', 'Rua Manuel', 'isinha@gmail.com',11923443257, 9432.23)

insert into Pedido values(1, '01-01-2020', '10:00', 12345678910, 1, 1, 12345678901)
insert into Pedido values(6, '07-01-2020', '13:00', 12345678910, 1, 1, 12345678902)
insert into Pedido values(2, '08-01-2020', '01:00', 12345678911, 2, 2, 12345678902)
insert into Pedido values(3, '06-01-2020', '22:00', 12345678912, 3, 3, 12345678903)
insert into Pedido values(4, '03-01-2020', '13:00', 12345678913, 4, 4, 12345678904)
insert into Pedido values(5, '02-01-2020', '05:00', 12345678914, 5, 5, 12345678905)


insert into NotaFiscal values(1, 7241.23, 'Dinheiro', '02-01-2020', 12345678910, 1)
insert into NotaFiscal values(6, 241.23, 'Dinheiro', '09-01-2020', 12345678910, 1)
insert into NotaFiscal values(2, 6241.23, 'Cartão de crédito', '05-01-2020', 12345678911, 2)
insert into NotaFiscal values(3, 5241.23, 'Cartão de débito', '03-01-2020', 12345678912, 3)
insert into NotaFiscal values(4, 4241.23, 'Dinheiro', '04-01-2020', 12345678913, 4)
insert into NotaFiscal values(5, 3111.23, 'Cartão de crédito', '09-01-2020', 12345678914, 5)





/*1*/
select endereco_clie from Cliente where endereco_clie = 'Rua Ariston de Azevedo';

select nome_clie from Cliente where nome_clie like '_a%';

select cpf_clie from Cliente where cpf_clie like '%1';

select email_clie from Cliente where email_clie = 'mattheus@gmail.com';

select telefone_clie from Cliente where telefone_clie like '_____2%';


/*2*/
select horario_ped from Pedido where horario_ped = '10:00' or horario_ped = '22:00';

select num_ped from Pedido where num_ped between 1 and 3;

select valor_ped from Pedido where valor_ped between 51 and 140;

select valor_ped from Pedido where valor_ped = 50;

select horario_ped from Pedido where horario_ped = '05:00';



/*3*/
select salario_fun,salario_fun * 1.20 'Acrésimo de 20%',salario_fun * 0.95 'Desconto de 5%' from Funcionario;

select cpf_fun from Funcionario where cpf_fun like '%5';

select nome_fun from Funcionario where nome_fun = 'Isabelle Gomes';

select endereco_fun from Funcionario where endereco_fun like '%o';

select telefone_fun from Funcionario where telefone_fun like '%7';


/*4*/
select forma_pag from NotaFiscal where forma_pag = 'Dinheiro';

select cod from NotaFiscal where cod between 3 and 6;

select num_ped from NotaFiscal where num_ped like '%5';

select valortotal from NotaFiscal where valortotal between 5000 and 8000;

select valortotal from NotaFiscal where valortotal like '3%';



/*5*/
select tam_beb from Bebida where tam_beb = 'Pequena';

select cod_beb from Bebida where cod_beb between 1 and 4;

select tam_beb from Bebida where tam_beb = 'Grande' or tam_beb = 'Média';

select valor_beb from Bebida where valor_beb between 12 and 14;

select sum (valor_beb) from Bebida;



/*6*/
select tam_prato from prato where tam_prato = 'Grande' or tam_prato = 'Pequena';

select avg (valor_prato) from prato;

select cod_prato from prato where cod_prato between 1 and 4; 

select nome_prato from prato where nome_prato like 'e%';

select COUNT (cod_prato) from prato;
	

-- EXERCICIOS AULAS DE INNER JOIN E FUNÇÕES

--1
select nome_clie 'Nome do Cliente', Cliente.cpf_clie 'CPF do Cliente', horario_ped 'Horário feito' from Pedido
inner join Cliente
on Cliente.cpf_clie = Pedido.cpf_clie 

--2
select num_ped 'Número do pedido', nome_beb 'Nome da bebida', nome_prato 'Nome do prato' from Pedido
inner join Bebida
on Pedido.cod_beb = Bebida.cod_beb
inner join Prato
on Pedido.cod_prato = Prato.cod_prato

--3
select sum(valor_beb), cpf_clie from Bebida 
inner join Pedido
on Pedido.cod_beb = Bebida.cod_beb
group by Pedido.cpf_clie

--4
select cpf_clie 'CPF do cliente', valor_prato + valor_beb 'Soma total' from Pedido
inner join Bebida
on Pedido.cod_beb = Bebida.cod_beb
inner join Prato
on Pedido.cod_prato = Prato.cod_prato

--5
select Funcionario.cpf_fun, nome_fun, num_ped from Funcionario
inner join Pedido
on Funcionario.cpf_fun = Pedido.cpf_fun

--6
select forma_pag, Cliente.cpf_clie from NotaFiscal
inner join Cliente
on NotaFiscal.cpf_clie = Cliente.cpf_clie

--7
select forma_pag, Cliente.cpf_clie from NotaFiscal
inner join Cliente
on NotaFiscal.cpf_clie = Cliente.cpf_clie
where forma_pag = 'Cartão de crédito'

--8
select dt_ped, num_ped, nome_clie from Pedido
inner join Cliente
on Pedido.cpf_clie = Cliente.cpf_clie
where dt_ped between '2020-01-01' and '2020-05-01'

--9
select avg(valortotal) 'Média dos pedidos', nome_clie from NotaFiscal
left join Cliente
on NotaFiscal.cpf_clie = Cliente.cpf_clie
group by Cliente.nome_clie

--10
select nome_clie, horario_ped from Pedido
right join Cliente
on Pedido.cpf_clie = Cliente.cpf_clie

--11
select * from Pedido
inner join Cliente
on Pedido.cpf_clie = Cliente.cpf_clie
inner join Funcionario
on Pedido.cpf_fun = Funcionario.cpf_fun
inner join NotaFiscal
on Pedido.num_ped = NotaFiscal.num_ped
inner join Prato
on Pedido.cod_prato = Prato.cod_prato
inner join Bebida
on Pedido.cod_beb = Bebida.cod_beb
