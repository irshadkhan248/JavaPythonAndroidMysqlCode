-- reverse the number

delimiter $$
use L9_db $$
drop procedure if exists p5 $$
create procedure p5(n int)
begin 
declare rev int default 0;
declare a int default 0;

if(n<0)then
	select "b +ve " as MSG;
else
	repeat 
		set a=n%10;
		set rev=(rev*10)+a;
		set n=n div 10;
		until n=0
	end repeat;
	select rev as RESULT;
end if;
end $$
delimiter ;