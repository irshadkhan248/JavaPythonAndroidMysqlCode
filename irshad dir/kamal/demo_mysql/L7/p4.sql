-- procedure to dispaly length of the string

delimiter $$
drop procedure if exists p4 $$
create procedure p4(num int)
begin
select rand(num);
end $$


delimiter ;