delimiter $$
drop procedure if exists pinout $$
create procedure pinout(inout info varchar(30))
begin
select loc into info from student10 where name=info;
end $$
delimiter ;
