delimiter $$
use l10_db
drop trigger if exists sbi_2 $$
create trigger sbi_2 before insert on stu for each row 
begin
if length(new.name)<2 then
signal SQLSTATE '44444' set message_text="enter correct name ";
end if ;
end $$
delimiter ;