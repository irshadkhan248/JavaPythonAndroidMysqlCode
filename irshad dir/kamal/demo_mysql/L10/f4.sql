delimiter $$
use l10_db $$
drop function if exists f4 $$
create function f4() returns float deterministic 
begin
declare m int default 0;
declare ma int default 0;
declare c1 cursor for select marks from student where marks is not null;
open c1;
	begin
	declare exit handler for 1329 begin end;
	while true do
		fetch c1 into m;
		if m > ma then
			set ma=m;
		end if;
	end while;
	
	end ;
close c1;
return ma;
end $$
delimiter ;