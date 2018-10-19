 create table nasabah (id varchar(36) not null, alamat varchar(255), nama varchar(255), no_ktp varchar(255), primary key (id)) engine=MyISAM;
 create table s_group (id varchar(36) not null, description varchar(255), name varchar(255), primary key (id)) engine=MyISAM;
 create table s_group_permission (id_group varchar(36) not null, id_permission varchar(36) not null, primary key (id_group, id_permission)) engine=MyISAM;
 create table s_permission (id varchar(36) not null, permission_label varchar(255), permission_value varchar(255), primary key (id)) engine=MyISAM;
 
 create table s_user (id varchar(36) not null, active bit not null, fullname varchar(255), username varchar(255), id_group varchar(36) not null, primary key (id)) engine=MyISAM;
 create table s_user_password (id_user varchar(36) not null, password varchar(255), primary key (id_user)) engine=MyISAM;
 
 alter table nasabah add constraint UK_cx9g94iqwam8vm3xegun25mj8 unique (no_ktp);
 alter table s_group_permission add constraint FK6f8vbe3tflnukx1l9qi7p4ymg foreign key (id_permission) references s_permission (id);
 alter table s_group_permission add constraint FKkx9iw68w5uhbh5hpk2o2xxh3v foreign key (id_group) references s_group (id);
 alter table s_user add constraint FK7wf1d3rstansmy88pcmoduvft foreign key (id_group) references s_group (id);
 alter table s_user_password add constraint FKawyesj4b8c49ofvrmpa3lx3lv foreign key (id_user) references s_user (id);
