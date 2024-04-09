create database aula8;
use aula8;

create table endereco(
	id int primary key not null auto_increment,
    rua varchar(50) not null,
    numero int not null,
    complemento varchar(50),
    bairro varchar(50) not null,
    cidade varchar(50) not null,
    estado varchar(50) not null,
    cep int not null
);

create table fornecedor(
	id int primary key not null auto_increment,
    nome varchar(40) not null,
    endereco_id int not null,
    email varchar(40) not null,
    telefone int not null
);
alter table fornecedor add foreign key (endereco_id) references endereco(id);

create table produto(
	id int primary key not null auto_increment,
    fornecedor_id int not null,
    quantidade_estoque int not null,
    preco_compra double not null,
    preco_venda double not null
);

alter table produto add foreign key (fornecedor_id) references fornecedor(id);


create table cliente(
	cpf int primary key not null,
    nome varchar(50) not null,
    endereco_id int not null,
    telefone int not null,
    email varchar(60) not null,
    sexo varchar(1) not null,
    data_nascimento date not null
);

alter table cliente add foreign key (endereco_id) references endereco(id);

create table compras(
	id int primary key not null auto_increment,
    cliente_cpf int not null,
    quantidade int not null,
    total_por_item double not null,
    total_geral double not null
);

alter table compras add foreign key (cliente_cpf) references cliente(cpf);