create database Visas_agency;
use Visas_agency;

create table visas (
	id int auto_increment primary key,
    country varchar(45) not null ,
    visa_fee int check (visa_fee >=0),
    visa_fee_currency varchar(3) not null,
    cost int not null check (cost > 0)
);


create table clients (
id int auto_increment primary key,
name varchar(45),
application_date date not null default '2019-01-01',
decision_date date default '2019-01-01',
visa_id int,
status varchar (45)
);

insert into visas values (null, 'Colombia', 140, 'USD', 330), (null, 'UK', 128, 'USD', 145), (null, 'USA', 160, 'USD', 110),
						(null, 'Chile', 65, 'USD', 253), (null, 'Ireland', 4500, 'RUB', 198), (null, 'Morocco', 1550, 'RUB', 110), 
                        (null, 'Mexico', 40, 'USD', 154), (null, 'Japan', 0, 'USD', 66), (null, 'New Zealand', 182, 'USD', 264),
                        (null, 'Costa Rica', 52, 'USD', 220), (null, 'Canada', 185, 'CAD', 242), (null, 'India', 100, 'USD', 66),
                        (null, 'Myanmar', 50, 'USD', 66);

insert into clients values (null, 'Lola', '2019-01-05', '2019-02-01', 1, 'Issued'), (null, 'Alex', '2019-05-05', null, 5, null), 
					(null, 'John', '2019-04-03', '2019-04-21', 2, 'Issued'), (null, 'Jack', '2019-03-01', '2019-03-22', 2, 'Refused'),
                    (null, 'Alex', '2019-04-01', '2019-04-05', 13, 'Issued'), (null, 'Rita', '2019-01-12', '2019-01-25', 7, 'Issued'),
                    (null, 'Mark', '2019-03-11', '2019-03-11', 3, 'Refused'), (null, 'Jack', '2019-05-26', null, 3, 'Pending'),
                    (null, 'Marcus', '2019-05-27', null, 6, null), (null, 'James', '2019-05-13', null, 2, 'Pending'), (null, 'Bill', '2019-04-29', null, 11, 'Pending'),
                    (null, 'Mary', '2019-05-11', '2019-05-13', 3, 'Refused'),(null, 'Olga', '2019-05-27', null, 3, 'Pending'),
                    (null, 'Liz', '2019-05-23', null, 4, null), (null, 'Alex', '2019-05-05', null, 5, null), (null, 'Bob', '2019-05-14', null, 12, null),
                    (null, 'Molly', '2019-04-12', '2019-04-22', 6, 'Issued'), (null, 'Efim', '2019-02-07', '2019-02-17', 8, 'Issued'),
                    (null, 'Mark', '2019-02-06', '2019-03-11', 11, 'Issued'), (null, 'Erik', '2019-04-05', '2019-05-02', 11, 'Refused');


select * from visas;
select * from clients;