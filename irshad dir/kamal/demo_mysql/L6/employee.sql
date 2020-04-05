create table employee(id int primary key,name varchar(30),dept_name varchar(30),salary decimal(8,2),gender enum('m','f'));

insert employee values(1,'amit','comps',4500,'m');
insert employee values(2,'sumit','comps',5000,'m');
insert employee values(3,'reena','comps',5000,'f');
insert employee values(4,'nikhil','it',3500,'m');
insert employee values(5,'seema','extc',2500,'f');
insert employee values(6,'rakesh','it',4200,'m');
insert employee values(7,'rinkesh','comps',6200,'m');
insert employee values(8,'pooja','extc',2200,'f');
insert employee values(9,'saurabh','it',4800,'m');
insert employee values(10,'rahul','extc',5800,'m');


 1)mysql> select * from employee where salary =(select  min(salary)from employee);
 ++-+-+-++
 | id | name  | dept_name | salary  | gender |
 ++-+-+-++
 |  8 | pooja | extc      | 2200.00 | f      |
 ++-+-+-++
 1 row in set (0.00 sec)


 mysql> select *from employee where dept_name=(select dept_name from department where dept_hod='surya');
 ++-+-+-++
 | id | name    | dept_name | salary  | gender |
 ++-+-+-++
 |  1 | amit    | comps     | 4500.00 | m      |
 |  2 | sumit   | comps     | 5000.00 | m      |
 |  3 | reena   | comps     | 5000.00 | f      |
 |  7 | rinkesh | comps     | 6200.00 | m      |
 ++-+-+-++


 mysql> select *from employee where dept_name in (select dept_name from department where dept_bldg=1);
 ++-+-+-++
 | id | name    | dept_name | salary  | gender |
 ++-+-+-++
 |  1 | amit    | comps     | 4500.00 | m      |
 |  2 | sumit   | comps     | 5000.00 | m      |
 |  3 | reena   | comps     | 5000.00 | f      |
 |  4 | nikhil  | it        | 3500.00 | m      |
 |  6 | rakesh  | it        | 4200.00 | m      |
 |  7 | rinkesh | comps     | 6200.00 | m      |
 |  9 | saurabh | it        | 4800.00 | m      |
 ++-+-+-++

 mysql> select *from employee where salary in(select max(salary)from employee group by dept_name);
 ++-+-+-++
 | id | name    | dept_name | salary  | gender |
 ++-+-+-++
 |  7 | rinkesh | comps     | 6200.00 | m      |
 |  9 | saurabh | it        | 4800.00 | m      |
 | 10 | rahul   | extc      | 5800.00 | m      |
 ++-+-+-++


 mysql> create table for_comps like employee;
 mysql> insert into for_comps select * from employee where dept_name='comps';


 mysql> create table for_it like employee;
 mysql> insert into for_comps select * from employee where dept_name='it';

 mysql>  create table for_extc like employee;
 mysql>  insert into for_comps select * from employee where dept_name='extc';
