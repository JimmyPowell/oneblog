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
create table post
(
    id                 int auto_increment
        primary key,
    title              varchar(50)                         null,
    content            varchar(10000)                      not null,
    type               int                                 not null,
    post_excerpt       varchar(100)                        null,
    post_status        int                                 null,
    post_date          timestamp default CURRENT_TIMESTAMP null comment '首次发表时间',
    latest_update_date timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP comment '最新更新时间'
);
create table user
(
    id                int auto_increment
        primary key,
    name              varchar(20)  not null,
    password          varchar(20)  not null,
    email             varchar(30)  null,
    phone_number      varchar(15)  null,
    self_introduction varchar(100) null
);
create table external_link
(
    id          int auto_increment
        primary key,
    name        varchar(10)                         null,
    url         varchar(30)                         not null,
    create_time timestamp default CURRENT_TIMESTAMP null,
    update_time timestamp default CURRENT_TIMESTAMP null on update CURRENT_TIMESTAMP
);




