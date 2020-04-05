-- procedure to dispaly length of the string

delimiter $$
drop procedure if exist p1 $$
create procedure p1(s1 varchar(30))
begin
select length(s1)LENGTH;
end $$


delimiter ;