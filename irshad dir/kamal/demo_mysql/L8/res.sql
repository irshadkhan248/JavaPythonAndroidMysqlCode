delimiter $$
drop procedure if exists res $$
create procedure res(r int,out n varchar(35))
begin
declare SI int;
declare SII int;
declare reslt int;
declare g varchar(5);
declare name varchar(5);
select semI into SI from result where rno=r;
select semII into SII from result where rno=r;
select sname into name from result where sname=n;
set reslt=SI+SII;
if reslt > 150 then
	set g='A++';
elseif reslt >120 then
	set g='A';
elseif reslt >100 then 
	set g='B';
else set g='C';
end if;
select name,g as RESULT;
end $$
delimiter ;