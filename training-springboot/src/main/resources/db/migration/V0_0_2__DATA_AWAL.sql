/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  anggi
 * Created: Oct 19, 2018
 */

insert into s_permission (id,permission_label,permission_value) values ('1' ,'ROLE VIEW NASABAH','ROLE_VIEW_NASABAH');
insert into s_permission (id,permission_label,permission_value) values ('2','ROLE EDIT NASABAH','ROLE_EDIT_NASABAH');

insert into s_group(id,name,description) values ('1','admin','GROUP ADMIN');
insert into s_group(id,name,description) values ('2','user','GROUP USER');

insert into s_group_permission (id_group,id_permission) values ('1','1');
insert into s_group_permission (id_group,id_permission) values ('1','2');
insert into s_group_permission (id_group,id_permission) values ('2','1');

insert into s_user (id,username,fullname,id_group,active) values ('1','anggi@mail.com','anggi riyandi','1',true);
insert into s_user (id,username,fullname,id_group,active) values ('2','wahyu@mail.com','wahyu','2',true);

insert s_user_password (id_user,password) values ('1','admin123');
insert s_user_password (id_user,password) values ('2','user123');

