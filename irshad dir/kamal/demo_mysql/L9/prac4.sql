-- find armstrong number


delimiter $$
use L9_db $$
drop procedure if exists p6 $$
create procedure p6(n int)
begin 
declare sum int default 0;
declare a int default 0;
declare org_num int default n;

if(n<0)then
	select "b +ve " as MSG;
else
	repeat 
		set a=n%10;
		set sum=sum+pow(a,3);
		set n=n div 10;
		until n=0
	end repeat;
	if org_num=n 
		then 
		select " yes it is" as MSG;
		else
		select " no it is not" as MSG;
	end if;
end if;
end $$
delimiter ;