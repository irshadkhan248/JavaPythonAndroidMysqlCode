delimiter $$
use 15_04_db $$
drop function if exists total_count $$
create function  total_count() returns int deterministic
begin 
declare c int ;
select count(*) into c from user ;
return c ;
end $$
delimiter ;