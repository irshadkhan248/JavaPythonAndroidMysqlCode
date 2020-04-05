delimiter $$
use L9_db
drop procedure if exists p10 $$
create procedure p10()
begin 
declare cm int default 0;
declare cf int default 0;
declare s varchar(2) default "";
declare c1 cursor for select sex from student;

open c1;
	begin 
	declare exit handler for 1329 begin end;
	while true do 
		fetch c1 into s;
		case s
			when 'm' then set cm=cm+1;
		else
			set cf=cf+1;
		end case ;
	end while;
	end;
close c1;
select concat("female count ",cf," male count ",cm);
end $$
delimiter ;