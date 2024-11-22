create table friend_link
(
    id          int auto_increment
        primary key,
    name        varchar(20)                         not null,
    url         varchar(100)                        not null,
    avatar      varchar(50)                         null,
    create_time timestamp default CURRENT_TIMESTAMP null,
    update_time timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP,
    `rank`      int                                 not null
);


