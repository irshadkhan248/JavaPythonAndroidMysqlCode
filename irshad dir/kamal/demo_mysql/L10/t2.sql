delimiter $$
use l10_db
drop trigger if exists sbi $$
create trigger sbi before update on stu for each row 
begin
if(new.marks < 0 or new.marks > 100) then
signal SQLSTATE '44444' set message_text="marks not in range ";
end if ;
end $$
delimiter ;