create table if not exists students
(
    id int not null auto_increment primary key,
    registration_number varchar(50) unique,
    first_name varchar(50) not null,
    last_name varchar(50),
    email varchar(50) unique,
    password varchar(50)
)