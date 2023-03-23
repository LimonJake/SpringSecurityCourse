create table users(
	id_users serial primary key,
	username varchar(50) not null,
	password varchar(500) not null,
	enabled boolean not null
);

create table authorities (
	id_authorities serial primary key,
	username varchar(50) not null,
	authority varchar(50) not null,
	fk_authorities_users integer references users(id_users) unique
);


select * from users limit 10;
select * from authorities limit 10;


insert into users(username, password, enabled) values ('Limon', '54321', TRUE);
insert into authorities(username, authority, fk_authorities_users) values ('Limon', 'write',1);


select
	u.username, u.password, u.enabled,
	a.authority
from users u
inner join authorities a
on u.id_users = a.fk_authorities_users;

insert into users(username, password, enabled) values ('Jake', '54321', TRUE);
insert into authorities(username, authority, fk_authorities_users) values ('Jake', 'write',2);