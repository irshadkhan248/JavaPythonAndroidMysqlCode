delimiter $$
drop procedure if exists p2 $$
create procedure p2(s1 varchar(30))
begin
select upper(s1)AS CAPITILIZE;
end $$

delimiter ;