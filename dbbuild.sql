use Juices;

create table furnizori
(
	id_furnizor int auto_increment primary key,
    nume varchar(255)
);

create table produse
(
	id_prod int auto_increment primary key,
    id_furnizor int,
    foreign key (id_furnizor) references furnizori(id_furnizor),
    denumire varchar(255),
    tip varchar(255),
    p_zahar int,
    p_fruct int,
    categorie varchar(255),
    pret int,
    popularitate varchar(255)
);
create table vanzari(
	id_vanzare int auto_increment primary key,
    id_prod int,
    foreign key (id_prod) references produse(id_prod),
    data_v varchar(255)
);

create table roles
(
	tip varchar(255) primary key
);
create table users
(
	username varchar(255) primary key,
    password varchar(255),
    tip varchar(255),
    foreign key (tip) references roles(tip)	
);

create table cumparari
(
	id_cump int auto_increment primary key,
    username varchar(255),
    foreign key (username) references users(username),
    id_vanzare int,
    foreign key (id_vanzare) references vanzari(id_vanzare)
);


insert into roles(tip)
values
	('user'),
	('admin'),
	('furnizor');
    
insert into furnizori(nume)
values
	('Vita'),
	('Naturalis'),
    ('sucuri');
insert into users(username, password, tip)
values
	('Ana', 'ana123', 'user'),
	('Maria', 'maria123', 'user');
insert into produse(id_furnizor, denumire, tip, p_zahar, p_fruct, categorie, pret, popularitate)
values
	(3, 'suc de mere', 'natural', 15, 30, 'copii', 20, 50),
	(2, 'suc de mere', 'natural', 20, 30, 'adulti', 20, 50),
	(3, 'suc de mere', 'natural', 15, 30, 'copii', 20, 50),
	(2, 'suc de mere', 'natural', 20, 30, 'adulti', 20, 50),
	(3, 'suc de mere', 'natural', 15, 30, 'copii', 20, 50),
	(2, 'suc de mere', 'natural', 20, 30, 'adulti', 20, 50),
	(3, 'suc de mere', 'natural', 15, 30, 'copii', 20, 50),
	(2, 'suc de rosii', 'natural', 20, 30, 'adulti', 20, 50),
	(3, 'suc de rosii', 'natural', 15, 30, 'copii', 20, 50),
	(2, 'suc de rosii', 'natural', 20, 30, 'adulti', 20, 50),
	(3, 'suc de rosii', 'natural', 15, 30, 'copii', 20, 50),
	(2, 'suc de rosii', 'natural', 20, 30, 'adulti', 20, 50),
	(3, 'suc de rosii', 'natural', 15, 30, 'copii', 20, 50),
	(2, 'suc de rosii', 'natural', 20, 30, 'adulti', 20, 50),
	(3, 'suc de rosii', 'natural', 15, 30, 'copii', 20, 50),
	(2, 'suc de rosii', 'natural', 20, 30, 'adulti', 20, 50),
	(3, 'suc de rosii', 'natural', 15, 30, 'copii', 20, 50),
	(2, 'suc de rosii', 'natural', 20, 30, 'adulti', 20, 50),
	(3, 'suc de rosii', 'natural', 15, 30, 'copii', 20, 50),
	(2, 'suc de rosii', 'natural', 20, 30, 'adulti', 20, 50),
	(3, 'suc de rosii', 'natural', 15, 30, 'copii', 20, 50),
	(2, 'suc de portocale', 'natural', 20, 30, 'adulti', 20, 50),
	(3, 'suc de portocale', 'natural', 15, 30, 'copii', 20, 50),
	(2, 'suc de portocale', 'natural', 20, 30, 'adulti', 20, 50),
	(3, 'suc de portocale', 'natural', 15, 30, 'copii', 20, 50),
	(2, 'suc de portocale', 'natural', 20, 30, 'adulti', 20, 50),
	(3, 'suc de portocale', 'natural', 15, 30, 'copii', 20, 50),
	(2, 'suc de portocale', 'natural', 20, 30, 'adulti', 20, 50),
	(3, 'suc de portocale', 'natural', 15, 30, 'copii', 20, 50),
	(2, 'suc de portocale', 'natural', 20, 30, 'adulti', 20, 50),
	(3, 'suc de portocale', 'natural', 15, 30, 'copii', 20, 50),
	(2, 'suc de portocale', 'natural', 20, 30, 'adulti', 20, 50),
	(3, 'suc de portocale', 'natural', 15, 30, 'copii', 20, 50),
	(2, 'suc de portocale', 'natural', 20, 30, 'adulti', 20, 50),
	(3, 'suc de portocale', 'natural', 15, 30, 'copii', 20, 50),
	(2, 'suc de portocale', 'natural', 20, 30, 'adulti', 20, 50),
	(3, 'suc de portocale', 'natural', 15, 30, 'copii', 20, 50);
