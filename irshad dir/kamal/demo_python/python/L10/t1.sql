delimiter $$
-- use py_conn2 $$
drop trigger if exists t1 $$
create trigger t1 before insert on employee for each row
begin
if (new.eid <1 or new.eid>100) then
signal SQLSTATE '11111' set message_text=' eid not in range ';
end if;
end $$
delimiter ;