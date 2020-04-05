delimiter $$
use 15_04_db $$
drop function if exists salsum $$
create function  salsum()returns varchar(60) deterministic
begin 
declare m int ;
declare x int ;
declare s varchar(60) ;
select min(salary) into m from employee ;
select max(salary) into x from employee ;
select concat('minimun salary:',m,' | ',' maximum salary:',x) into s;
return s ;
end $$
delimiter ;