drop database if exists tems;
create database tems;
use tems;

create table traning_main (
  traning_id int auto_increment,
  name varchar(50) not null,
  category int not null,
  goal varchar(100),
  nop_min int,
  nop_max int,
  organize varchar(100),
  traning_text varchar(255),
  phenomenon varchar(100),
  img varchar(255),
  registration_date datetime not null default current_timestamp,
  primary key (traning_id)
);

create table category_master(
  id int auto_increment,
  category int not null,
  primary key(id)
);

create table keyword_table(
  id int auto_increment,
  t_id int not null,
  keyword varchar(50),
  primary key (id)
);

create table img (
	img_id int auto_increment,
	t_id int,
	img_path text,
	primary key (img_id)
);

