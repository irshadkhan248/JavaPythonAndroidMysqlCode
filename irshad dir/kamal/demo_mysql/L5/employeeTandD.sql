create table if not exists employee(id int primary key,name varchar(25),dept_name varchar(25),salary int ,gender char(1));
replace into  employee  values(1,'amit','comps',4500,'m');
replace into  employee  values(2,'sumit','comps',5000,'m');
replace into  employee  values(3,'reena','comps',5000,'f');
replace into  employee  values(4,'nikhil','it',3500,'m');
replace into  employee  values(5,'seema','extc',2500,'f');
replace into  employee  values(6,'rakesh','it',4200,'m');
replace into  employee  values(7,'rinkesh','comps',6200,'m');
replace into  employee  values(8,'pooja','extc',2200,'f');
replace into  employee  values(9,'saurabh','it',4800,'m');
replace into  employee  values(10,'rahul','extc',5800,'m');


-- question. find total salary  of employees
-- answer
-- select sum(salary)from employee;

-- find total salary  of employees with alias
-- answer
-- select sum(salary)total from employee;

-- boonous 5% of salary
-- select sum(salary*0.5)bonus from employee;
-- sum of salary greater than 4500
-- select sum(salary)from employee where salary>4500;

-- average of salary
-- select avg (salary)from employee;

-- max and minimum salary of employee

-- select max(salary),min(salary) from employee;
