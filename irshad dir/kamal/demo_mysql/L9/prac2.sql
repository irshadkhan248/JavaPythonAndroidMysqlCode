-- wamp to find the sum of digit

delimiter $$
use L9_db $$
drop procedure if exists p4 $$
create procedure p4(n int)
begin 
declare a int default 0;
declare i int default 1;
declare sum int default 0;
if(n<0)then
	select "b +ve " as MSG;
else
	while n>0 do
		set a=n%10;
		set sum=sum+a;
		set n=n div 10;
	end while;
	select sum as RESULT;
end if;
end $$
delimiter ;