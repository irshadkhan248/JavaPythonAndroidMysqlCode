delimiter $$
drop procedure if exists p3 $$
create procedure p3(num int)
begin
select sqrt(num);
end $$
delimiter ;
