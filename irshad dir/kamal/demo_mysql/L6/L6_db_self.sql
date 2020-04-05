create database l6_db_self;
use l6_db_self;

create table emp_1(id int primary key,name varchar(25),deptno int,salary decimal(8,2));

insert into emp_1 value(1,'smith',20,22000);
insert into emp_1 value(2,'jhon',30,18000);
insert into emp_1 value(3,'adam',20,23000);
insert into emp_1 value(4,'steve',30,24000);
insert into emp_1 value(5,'alex',10,30000);
insert into emp_1 value(6,'warren',10,20000);



mysql> select*from emp_1;
+----+--------+--------+----------+
| id | name   | deptno | salary   |
+----+--------+--------+----------+
|  1 | smith  |     20 | 22000.00 |
|  2 | jhon   |     30 | 18000.00 |
|  3 | adam   |     20 | 23000.00 |
|  4 | steve  |     30 | 24000.00 |
|  5 | alex   |     10 | 30000.00 |
|  6 | warren |     10 | 20000.00 |
+----+--------+--------+----------+

 select name,salary from emp_1 where salary> (select salary from emp_1 where name='adam');

+-------+----------+
| name  | salary   |
+-------+----------+
| steve | 24000.00 |
| alex  | 30000.00 |
+-------+----------+


 select name,salary from emp_1
 where salary< (select salary from emp_1 where name='adam')
 and
 deptno=(select deptno from emp_1 where name ='adam');

+-------+----------+
| name  | salary   |
+-------+----------+
| smith | 22000.00 |
+-------+----------+

select *from emp_1 where salary=(select max(salary)from emp_1);

+----+------+--------+----------+
| id | name | deptno | salary   |
+----+------+--------+----------+
|  5 | alex |     10 | 30000.00 |
+----+------+--------+----------+



select name ,deptno,salary from emp_1 where salary in(select max(salary)from emp_1 group by deptno)order by deptno;
+-------+--------+----------+
| name  | deptno | salary   |
+-------+--------+----------+
| alex  |     10 | 30000.00 |
| adam  |     20 | 23000.00 |
| steve |     30 | 24000.00 |
+-------+--------+----------+



create table dept_1(deptno int primary key,dept_name varchar(25),dept_loc varchar(25));


select *from dept_1;
+--------+-------------+----------+
| deptno | dept_name   | dept_loc |
+--------+-------------+----------+
|     10 | sales       | mumbai   |
|     20 | producation | pune     |
|     30 | marketing   | banglore |
|     40 | testing     | banglore |
+--------+-------------+----------+

select name from emp_1 where deptno in(select deptno from dept_1 where dept_loc='mumbai');
+--------+
| name   |
+--------+
| alex   |
| warren |
+--------+



-- select name,emp_1.deptno,dept_loc from emp_1,dept_1 
-- where emp_1.deptno in(select dept_1.deptno,dept_loc from dept_1 where dept_loc='mumbai');


-- ERROR 1241 (21000): Operand should contain 1 column(s)


--						correlated 

select name,salary,deptno from emp_1 e where salary > (select avg(salary)from emp_1 where e.deptno=deptno);
+-------+----------+--------+
| name  | salary   | deptno |
+-------+----------+--------+
| adam  | 23000.00 |     20 |
| steve | 24000.00 |     30 |
| alex  | 30000.00 |     10 |
+-------+----------+--------+


select name,salary from emp_1 e  order by salary desc limit 1,1;
+-------+----------+
| name  | salary   |
+-------+----------+
| steve | 24000.00 |
+-------+----------+
