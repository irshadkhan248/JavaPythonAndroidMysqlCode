delimiter $$
use l10_db
drop trigger if exists sau $$
create trigger sau after update on stu for each row 
begin
insert into stu_bkup value(old.rno,old.name,old.marks," update old",now());
insert into stu_bkup value(new.rno,new.name,new.marks," update new",now());
end $$
delimiter ;