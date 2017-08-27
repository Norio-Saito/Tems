drop database if exists tems;
create database tems;
use tems;

create table traning (
  traning_id int auto_increment,
  traning_name varchar(50) not null,
  person int,
  key_word varchar(50),
  traning_type int not null,
  traning_text varchar (255) not null,
  traning_image varchar(255),
  primary key (traning_id)
);
