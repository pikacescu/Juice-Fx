drop database if exists Juices;
create database if not exists Juices;
drop user if exists 'juice'@'localhost' ;
create user if not exists 'juice'@'localhost' identified by 'jcy';
grant all privileges on Juices.* to 'juice'@'localhost';
flush privileges;