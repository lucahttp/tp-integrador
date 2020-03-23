/**
 * Author:  evilnapsis
 * Created: Mar 28, 2016
 */

create database myjavaapp1;
use myjavaapp1;

create table user(
id int not null auto_increment primary key,
username varchar(125) unique,
password varchar(125),
created_at datetime
);

