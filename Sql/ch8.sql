desc department;

create table dept (dno number(2),
                    dname varchar2(14),
                    loc varchar2(13));
                    
create table dept2 
    as select * from dept;
    
create table dept3
    as
    select * from department;
    
select * from dept3;

desc dept3;

alter table dept3
    modify(loc varchar2(3));
    
select * from dept3;

desc dept3

alter table dept3
    drop column birth;
    
alter table dept3
    set unused(dno);
    
alter table dept3
    drop unused columns;
    
rename dept2 To dept22;

drop table dept22;

truncate table dept3;
select * from dept3;
select count(*) from dept3;

select table_name from user_tables
    order by table_name;
    
select owner, table_name from all_tables
    where owner = 'SCOTT';
    
select owner, table_name from dba_tables
    where owner = 'SCOTT';
    
drop table dept2;

create table dept2
    as
select * from department where 0 = 1;

insert into dept2
    values (10, 'ACCOUNTING', 'SEOUL');

insert into dept2
    values(40, 'TEST', null);

create table emp2
as select * from employee where 1 = 0;

desc emp2;
select * from emp2;

insert into emp2
    values (10, 'TOM', 'MANAGER',7788,
        to_date('2019-01-28','yyyy,mm,dd'),1000,0, 20);

insert into emp2
    select * from employee;

desc dept2;
select * from dept2;

update dept2
    set dname = 'PROGRAMING'
    where dno = 10;
    
update dept2
    set loc = 'BUSAN'
    where dno = 20;

update dept2
    set loc = 'INCHEON'
    where dno = 40;
    
update dept2
    set loc = 'JEJU';
    
update dept2
    set dname = (select dname from dept2
                where dno = 10),
        loc = (select loc from dept2
                where dno = 10)
        where dno = 20;
        
delete dept2
    where dno = 40;
    
delete dept2;

select * from dept2;

drop table ZIPCODE2;

create table emp2
as 
select * from employee;

select * from emp2;
        
insert into zipcode
select * from zipcode2;
          
select count(*) from zipcode;   

select * from zipcode
 where 시도 = '인천광역시';

select distinct 법정동명
    from zipcode
    where 법정동명 in (select a.법정동명
                    from zipcode a, zipcode b
                    where a.법정동명 = b.법정동명
                    and a.시군구 != b.시군구);
    
    select 시도, 시군구, 법정동명
    from zipcode
    group by 시도, 시군구, 법정동명;
    
     select 시도, 시군구, 법정동명
    from zipcode2
    group by 시도, 시군구, 법정동명;
    
    select distinct 시도, 시군구, 법정동명
                    from zipcode;
    
    
desc zipcode2;

select distinct(a.시군구), a.법정동명 
    from zipcode a, zipcode b
    where a.법정동명 = b.법정동명
    and a.시군구 != b.시군구
    order by a.법정동명;
    
select 시도, 시군구, 법정동명 
    from zipcode
    where 법정동명 in (select 법정동명
                    from 
                    ( select 시군구, 법정동명
                        from zipcode
                    group by 시군구, 법정동명
                    )
             group by 법정동명
             having count(*) > 1)
    group by 시도, 시군구, 법정동명
    order by 법정동명;


select 법정동명, count(*)
    from ( select 시군구, 법정동명
            from zipcode
            group by 시군구, 법정동명
            )
    group by 법정동명
    having count(*) > 1;
    
    
    