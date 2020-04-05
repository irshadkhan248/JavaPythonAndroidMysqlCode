delimiter $$
use l10_db
drop trigger if exists sai $$
create trigger sai after insert on stu for each row 
begin
insert into stu_bkup value(new.rno,new.name,new.marks," insert",now());
end $$
delimiter ;