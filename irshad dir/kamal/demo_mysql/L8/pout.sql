delimiter $$
drop procedure if exists pout $$
create procedure pout(rno int,out locn varchar(30))
begin
select loc into locn from student10 where r=rno;
end $$

-- call pout(30,@10) $$
-- select @10 $$
delimiter ;