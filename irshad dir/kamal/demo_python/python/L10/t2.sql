delimiter $$
-- use py_conn2 $$
drop trigger if exists t2 $$
create trigger t2 after insert on employee for each row
begin
insert into emp_bkup values (new.eid,new.ename,now(),'insert op ');
end $$
delimiter ;