set serveroutput on
create procedure sp_salary
is
    v_salary employee.salary%type;
begin
    select salary into v_salary
    from employee
    where ename = 'SCOTT';
    
    dbms_output.put_line('SCOTT의 급여는 ' || v_salary);
    end;
/
--프로시저 제거
drop procedure sp_salary_ename2;

--프로시저 실행
execute sp_salary;

--프로시저 생성 확인
select name, text from user_source
 where name like('%SP_SALARY%');
 
set serveroutput on
create procedure sp3_salary_name
(
    v_ename in employee.ename%type,
    v_dno in employee.dno%type
)
is
    v_salary employee.salary%type;
begin
    select salary into v_salary
    from employee
    where ename = v_ename
    and dno = v_dno;
    dbms_output.put_line(v_ename || '의 급여는 ' || v_salary || v_dno);
    end;
/

execute sp_salary_name('KING');

create procedure sp_salary_ename2
    (v_ename in employee.ename%type,
    v_salary1 out employee.salary%type)
is
begin
    select salary into v_salary1
    from employee
    where ename = v_ename;
end;
/

variable v_salary2 varchar2(14);
execute sp_salary_ename2('SCOTT', :v_salary2);
print v_salary2;
    
create or replace function fn_salary_ename
( v_ename in employee.ename%type )
    return number
is
    v_salary number(7, 2);
begin
    select salary into v_salary
    from employee
    where ename = v_ename;
    return v_salary;
end;
/

variable v_salary number;
execute :v_salary := fn_salary_ename('SCOTT');
print v_salary;

select ename, fn_salary_ename('SCOTT')
from employee
where ename = 'SCOTT';

create table dept_1
as
select * from department 
where 0 = 1;

create table dept_2
as
select * from department
where 0 =1 ;

create or replace trigger trigger_ex1
    after insert
    on dept_1
    for each row
begin
    if inserting then
        dbms_output.put_line('Insert Trigger 발생');
        insert into dept_2
            values(:new.dno, :new.dname, :new.loc);
    end if;
end;
/

insert into dept_1
values (10, 'ACCOUTING','NEW YORK');

select * from dept_2;

create or replace trigger trigger_ex2
    after delete
    on dept_1
    for each row
begin
    dbms_output.put_line('Delete Trigger 발생');
    delete from dept_2
        where dept_2.dno = :old.dno;
    end;
    /
delete dept_1 where dno = 10;

drop trigger trigger_ex2;