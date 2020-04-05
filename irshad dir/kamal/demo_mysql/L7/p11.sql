delimiter $$
drop procedure if exists p11 $$
create procedure p11 (s1 varchar(50),s2 varchar(50))
begin 
select concat(s1, s2);
end $$
delimiter ;
 