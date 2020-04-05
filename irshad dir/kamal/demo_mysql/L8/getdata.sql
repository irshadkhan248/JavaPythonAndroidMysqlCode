delimiter $$
use 15_04_db $$

drop procedure if exists getdata $$
create procedure getdata()
begin
declare exit handler for 1146
	select'frist create table then query' as MSG;
select'execution started 'as MSG;
select * from stu31;
select'execution ended'as MSG;
end $$
delimiter ;