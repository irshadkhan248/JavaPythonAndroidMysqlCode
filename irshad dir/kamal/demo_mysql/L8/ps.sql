delimiter $$
drop procedure if exists ps $$
create procedure ps(num int)
begin
declare exit handler for SQLSTATE '23002'
	select"inputs should be numerical";
if num is REGEXP '[[:digit:]]+'
	select sqrt(num);
else
	signal SQLSTATE '23002';
end $$
delimiter ;