select dno, dname from department
union
select eno, ename from employee;

create table salary (
    name varchar2(20),
    pay number(10));
    
insert into salary values('홍길동',1000000);
insert into salary values('김승욱',2000000);
insert into salary values('루  피',3000000);

commit;

create or replace procedure adjust (
    n in varchar2,
    rate in float)
is
    newpay float;
begin
    select pay into newpay from salary where name = n;
    
    newpay := newpay + newpay * rate;
    update salary set pay = newpay where name = n;
end;
/

select * from salary;

execute adjust;

select name, text from user_source
 where name like('%ADJUST%');
 
create table test1 (
        id varchar2(10),
        password varchar2(10));

insert into test1 
    values ('이순신', '0000');
 
 select * from test4;
 
 drop table test5;
 
 select * from employee;
 
 delete employee
 where eno = 8001;