delimiter $$
use l10_db
drop trigger if exists sau $$
create trigger sad after delete  on stu for each row 
begin
insert into stu_bkup value(old.rno,old.name,old.marks," delete ",now());
end $$
delimiter ;