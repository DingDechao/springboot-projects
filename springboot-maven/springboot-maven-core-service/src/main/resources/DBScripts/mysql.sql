create database ddc;
use ddc;
create table person (
id varchar(30) primary key not null,
firstName varchar(30),
lastName varchar(30)
);
select * from person;
insert into person values ('1', 'dc1', 'd1');
insert into person values ('2', 'dc2', 'd2');
insert into person values ('3', 'dc3', 'd3');
commit;