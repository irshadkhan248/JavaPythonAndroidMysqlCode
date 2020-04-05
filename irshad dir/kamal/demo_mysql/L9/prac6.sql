delimiter $$
use L9_db
drop procedure if exists p13 $$
create procedure p13()
begin 
declare a int default 0;
declare b int default 0;
declare c int default 0;
declare c1 cursor for select marks from student;

open c1;

	declare exit handler for 1329 begin end;
	if m >=85 then set a=a+1
	else if (m<85 and m>=60) then set b=b+1
	else set c=c+1;
	
close c1;
select concat('marks > 85', a,' marks less than 85 ', b,' marks less than 60',c);
end $$
delimiter ;