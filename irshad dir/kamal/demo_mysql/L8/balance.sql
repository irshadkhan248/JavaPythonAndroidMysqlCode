delimiter $$
drop procedure if exists balance $$
create procedure balance(r int)
begin
declare p_amt decimal(10,2);
declare t_amt decimal(10,2);
declare r_amt decimal(10,2);
select total_amount into t_amt from customer11 where rno=r;
select pending_amount into p_amt from customer11 where rno=r;
set r_amt=t_amt-p_amt;
select r_amt as 'AMOUNT RECEIVED';
end $$

delimiter ;
