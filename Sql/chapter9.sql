--Chater 09_데이터 조작과 트랜잭션
--
--01.EMP 테이블의 구조만 복사하여 EMP_INSERT란 이름의 빈 테이블을 만드시오.
create table emp_insert as
select * from emp 
where 0=1;
--02.본인을 EMP_INSERT 테이블에 추가하되 SYSDATE를 이용해서 입사일을 오늘로 입력하시오.
select * from emp_insert; 
desc emp_insert;

alter table emp_insert
add(edate date);

insert into emp_insert
values(26,'김승욱',41,20,sysdate);

--03.EMP_INSERT 테이블에 옆 사람을 추가하되 TO_DATE 함수률 이용해서 입사일을 어제로 입력하시오.
insert into emp_insert
values(20,'냐냐',32,12,to_date(sysdate-1));
--04.employee 테이블의 구조와 내용을 복사하여 EMP_COPY란 이름의 테이블을 만드시오.
create table emp_copy
as
select * from employee;
--05.사원번호가 7788인 사원의 부서번호를 10번으로 수정하시오.
select * from emp_copy;

update emp_copy
set dno = 10
where eno = 7788;
--06.사원번호 7788의담당 업무 및 급여를 사원번호 7499의 담당 업무 및 급여와 일치하도록 갱신하시오.
update emp_copy
set (job,salary) = (select job,salary
                    from emp_copy
                    where eno = 7499)
where eno = 7788;
--07.사원번호 7369와 업무가 동일한 모든 사원의 부서번호를 사원 7369의 현재 부서번호로 갱신하시오.
update emp_copy
set dno = (select dno
            from emp_copy
            where eno = 7369)
where job = (select job
            from emp_copy
            where eno = 7369);
--08.department 테이블의 구조와 내용을 복사하여 DEPT_COPY란 이름의 테이블을 만드시오.
create table dept_copy
as
select * from department;
--09.DEPT_COPY 테이블에서 부서명이 RESEARCH인 부서를 제거하시오.
select * from dept_copy;

delete dept_copy
where dname = 'RESEARCH';
--10.DEPT_COPY 테이블에서 부서 번호가 10거나 40인 부서를 제거하시오.
delete dept_copy
where dno in(10,40);
