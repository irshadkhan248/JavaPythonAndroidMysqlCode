-- procedure to dispaly length of the string

delimiter $$
drop procedure if exists p2 $$
create procedure p2(s1 varchar(30))
begin
select upper(s1)LENGTH;
end $$


delimiter ;