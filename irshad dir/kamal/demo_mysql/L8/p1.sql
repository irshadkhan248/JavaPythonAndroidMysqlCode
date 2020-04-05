delimiter $$
drop procedure if exists p1 $$
create procedure p1(s1 varchar(30))
begin
select length(s1)LENGTH;
end $$
delimiter ;