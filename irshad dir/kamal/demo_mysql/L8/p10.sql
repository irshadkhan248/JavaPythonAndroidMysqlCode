delimiter $$
use L9_db $$
drop procedure if exists p10 $$
create procedure p10(id int,na varchar(10),sa decimal(10,2))
begin
declare exit handler for 1062
select "id already exists "as "failure";
select "process started "as "MSG";
insert into emp value(id,na,sa);
select "record inserted "as "success ";
end $$
delimiter ; 