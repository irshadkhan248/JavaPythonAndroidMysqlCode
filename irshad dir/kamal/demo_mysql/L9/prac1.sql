-- wamp to find the sum of first n number

delimiter $$
use L9_db $$
drop procedure if exists p3 $$
create procedure p3(n int)
begin 
declare i int default 1;
declare sum int default 0;
if(n<0)then
	select "b +ve " as MSG;
else
	while i<=n do
		set sum=sum+i;
		set i=i+1;
	end while;
	select sum as RESULT;
end if;
end $$
delimiter ;