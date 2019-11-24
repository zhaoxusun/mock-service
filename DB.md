本服务依赖数据库
* 主要包括几个表
    - mock_app（mock配置表）（核心表）
    - mock_strategy（mock策略表）（核心表）
    - mock_app_strategy（mock配置和策略关系表）（核心表）
    - mock_group（mock配置组表）（管理使用）
    - mock_group_app（mock配置组和mock配置关系表）（管理使用）
    - mock_group_strategy（mock配置组和mock策略关系表）（暂未用到）
    
* 表结构：
    - -- auto-generated definition
      create table mock_app
      (
        id               int auto_increment,
        name             varchar(200) null,
        description      varchar(200) null,
        request_type     varchar(20)  null,
        request_uri      varchar(200) null,
        request_query    longtext     null,
        request_body     longtext     null,
        request_header   longtext     null,
        mock_data        longtext     null,
        redirect_type    varchar(200) null,
        redirect_url     varchar(200) null,
        redirect_query   longtext     null,
        redirect_body    longtext     null,
        redirect_header  longtext     null,
        proxy_url_perfix varchar(200) null,
        is_active        tinyint(1)   null,
        create_time      timestamp    not null,
        update_time      timestamp    not null,
        approver         varchar(200) not null,
        constraint mock_app_id_uindex
        unique (id)
      );
      
      alter table mock_app
        add primary key (id);
      
    - -- auto-generated definition
      create table mock_app_strategy
      (
        id          int auto_increment,
        app_id      int          not null,
        strategy_id int          not null,
        create_time timestamp    not null,
        update_time timestamp    not null,
        approver    varchar(200) not null,
        constraint mock_app_strategy_app_id_uindex
        unique (app_id),
        constraint mock_app_strategy_id_uindex
        unique (id)
      );
      
      alter table mock_app_strategy
        add primary key (id);
        
    - -- auto-generated definition
      create table mock_group
      (
        id          int auto_increment,
        name        varchar(200) not null,
        description varchar(200) not null,
        is_active   tinyint(1)   not null,
        create_time timestamp    not null,
        update_time timestamp    not null,
        approver    varchar(200) not null,
        constraint mock_group_id_uindex
        unique (id),
        constraint mock_group_name_uindex
        unique (name)
      );
      
      alter table mock_group
        add primary key (id);
      
    - -- auto-generated definition
      create table mock_group_app
      (
        id          int auto_increment,
        group_id    int          not null,
        app_id      int          not null,
        create_time timestamp    not null,
        update_time timestamp    not null,
        approver    varchar(200) not null,
        constraint mock_group_app_app_id_uindex
        unique (app_id),
        constraint mock_group_app_id_uindex
        unique (id)
      );
      
      alter table mock_group_app
        add primary key (id);
      
    - -- auto-generated definition
      create table mock_group_strategy
      (
        id          int auto_increment,
        group_id    int          not null,
        strategy    int          not null,
        create_time timestamp    not null,
        update_time timestamp    not null,
        approver    varchar(200) not null,
        constraint mock_group_strategy_id_uindex
        unique (id)
      );
      
      alter table mock_group_strategy
        add primary key (id);
      
    - -- auto-generated definition
      create table mock_strategy
      (
        id                     int auto_increment,
        name                   varchar(200) not null,
        description            varchar(200) not null,
        mock_response_strategy int          not null,
        create_time            timestamp    not null,
        update_time            timestamp    not null,
        approver               varchar(200) not null,
        constraint mock_strategy_id_uindex
        unique (id)
      );
      
      alter table mock_strategy
        add primary key (id);
      

      

    