delimiter $$
use l10_db $$
drop function if exists f5 $$
create function f5() returns varchar(30) deterministic 
begin
declare s char(2) default 0;
declare m int default 0;
declare f int default 0;
declare res varchar(30) default "";
declare c1 cursor for select sex from student;
open c1;
	begin
	declare exit handler for 1329 begin end;
	while true do
		fetch c1 into s;
		if s='m'  then
			set m=m+1;
		else
			set f=f+1;
		end if;
	end while;
	
	end ;
close c1;
set res=concat("male ",m," female ",f);
return res;

end $$
delimiter ;