create database dia3_spring_boot;

use dia3_spring_boot;

# API CRUD de persona basada en Spring Data
create table person(
	id int primary key auto_increment,
    name varchar(255) null,
    age int not null
);

select * from person;