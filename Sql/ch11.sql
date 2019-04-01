drop table dept;

create view v_emp_sample
as
select eno, ename, job, manager, dno
    from employee;
    
create view v_emp_complex2
as
select e.eno, e.ename, e.salary, dno, d.dname, d.loc
    from employee e natural join department d;
    
select view_name, text
    from user_views;
    
select * from v_emp_sample;

create or replace view v_emp_salary
as
select eno, ename
        from employee;

create or replace view v_emp_salary
as
select dno, sum(salary) as "sal_sul",
            round(avg(salary)) as "sal_avg"
        from employee
        group by dno;


select * from v_emp_salary;

select * from employee;

insert into v_emp_salary
values (8001,'홍길동');

drop view v_emp_sample;

create or replace view v_emp_job_nochk
as
select eno, ename, dno, job
    from employee
    where job like 'MANAGER';
    
create or replace view v_emp_job_nochk
as
select eno, ename, dno, job
    from employee
    where job like 'SALESMAN' with check option;
    
create or replace view v_emo_job_readoly
as
select eno, ename, dno, job
from employee
where job like 'MANAGER' with read only;


--Chater 11_뷰
--
--01.20번 부서에 소속된 사원의 사원번호와 이름과 부서번호를 출력하는 SELECT 문을 하나의 뷰{ιem_dno) 로 정의하시오.
create view v_emp_dno
as
select eno, ename, dno
    from employee
    where dno = 20;
    
select * from v_emp_dno;

--02.이미 생성된 뷰{v_em_dno)에 대해서 급여 역시 출력할 수 있도록 수정하시오.
create or replace force view v_emp_dno
as
select eno, ename, dno, salary
    from employee
    where dno = 20;

select * from v_emp_dno;

--03.생성된 뷰{v_em_dno}를 제거하시오.
drop view v_emp_dno;

