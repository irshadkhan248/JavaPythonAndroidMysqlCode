delimiter $$
drop procedure if exists p4 $$
create procedure p4(IN num int)
begin 
SELECT truncate((RAND()*num),0)RESULT;
end $$

delimiter ;
