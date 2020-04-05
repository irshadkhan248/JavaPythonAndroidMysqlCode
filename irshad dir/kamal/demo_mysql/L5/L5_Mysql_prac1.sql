mysql> create table user(id int primary key,name varchar(30),course_id int);


mysql> create table course(c_id int primary key,name varchar(30));




mysql> alter table user add constraint fk1 foreign key(course_id)references course(c_id);



mysql> insert course value(1,'android'),(2,'python'),(3,'java'),(4,'mysql');


mysql> insert user1 value(1,'amit',1),(2,'smit',null),(3,'vishal',1),(4,'sumit',3),(5,'suman',null);




mysql> select user.name,course.name from user,course where user.course_id=course.c_id;
+--------+---------+
| name   | name    |
+--------+---------+
| amit   | android |
| vishal | android |
| sumit  | java    |
+--------+---------+



mysql> select user.name,course.name from user inner join course on user.course_id=course.c_id;
+--------+---------+
| name   | name    |
+--------+---------+
| amit   | android |
| vishal | android |
| sumit  | java    |
+--------+---------+
3 rows in set (0.00 sec)



mysql> select a.name,b.name from course a,user b where a.c_id=b.course_id;
+---------+--------+
| name    | name   |
+---------+--------+
| android | amit   |
| android | vishal |
| java    | sumit  |
+---------+--------+
3 rows in set (0.00 sec)


mysql> select a.name,b.name from user a,left join course b on  b.course_id=a.c_id;

mysql> select a.name,b.name from course a left join user b on a.c_id=b.course_id;
+---------+--------+
| name    | name   |
+---------+--------+
| android | amit   |
| android | vishal |
| python  | NULL   |
| java    | sumit  |
| mysql   | NULL   |
+---------+--------+
5 rows in set (0.00 sec)