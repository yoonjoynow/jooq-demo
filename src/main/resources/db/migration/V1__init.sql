create sequence if not exists hibernate_sequence start with 1 increment by 1;

create table if not exists meeting
(
    id bigint auto_increment not null,
    location varchar(255) not null,
    title varchar(255) not null,
    primary key (id)
);

create table if not exists person
(
    id bigint auto_increment not null,
    created_at timestamp,
    email varchar(255),
    name varchar(255) not null,
    primary key (id)
);