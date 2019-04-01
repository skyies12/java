drop table customer;
desc customer;

create table customer ( id  varchar2(20) unique,
                        pwd varchar2(20) not null,
                        name varchar2(20) not null,
                        phone varchar2(30),
                        address varchar2(100));
                        
insert into customer
values ('a3', 'pw', '홍길동3','010-3456-5789','가산동-3');

select * from customer;

insert into customer(id,pwd,name)
values ('id2','12452','홍길동3');

update customer
set phone = '010'
where phone is null;

select table_name, constraint_name
    from user_constraints
    where table_name in('CUSTOMER');
    
create table dept (
    dno number(2) constraint dept_dno_pk primary key,
    dname varchar2(14),
    loc varchar2(13));
    
create table emp1 (
    eno number(4) constraint emp1_eno_pk primary key,
    ename varchar2(10),
    job varchar2(9),
    dno number(2) constraint emp1_dno_fk references dept);
 
  insert into dept
  select * from department;

  select * from emp1;
  
 insert into emp
 values(1,'ddd',-15);
 
 
  alter table dept
    drop primary key cascade;
 
 alter table emp1
    drop constraint emp_dno_fk;

drop table emp1;
 
select * from emp4;    
create table emp (
                    eno number(4) constraint emp_eno_pk primary key,
                    ename varchar2(10),
                    salary number(7, 2),
                    constraint emp_salary_chk1 check (salary > 0),
                    constraint emp_salary_chk2 check (salary != 0));
                    
select * from emp1;

create table emp1 (
                    eno number(4) constraint emp1_eno_pk primary key,
                    ename varchar2(10),
                    salary number(7, 2) default 1000);

insert into emp1
values (2, 'test2', null);
       
insert into emp4
values ('42' ,'홍길동',0);

create table emp (
                    eno number(4),
                    ename varchar2(10),
                    salary number(7, 2));
                    
select * from emp_second;

insert into emp_second(eno,ename)
values(32, 'ddd');

drop table emp;

select * from emp;

alter table emp
    add constraint emp_eno_pk primary key(eno);
  
alter table emp
    add constraint emp_salary_chk check(salary > 0);
    
alter table emp
    modify ename constraint emp_ename_nn not null;
    
select rowid, rownum, eno, ename
    from employee;
    
select table_name, constraint_name
    from user_constraints
    where table_name in('EMP');

alter table emp
    drop primary key;
    
alter table emp
    drop constraint emp_salary_chk;
    

--Chater 10_데이터 무결성과 제약 조건
--
--01.employee 테이블의 구조를 복사히여 EMP_SAMPLE란 이름의 테이블을 만드시오. 
--사원 테이블의 사원번호 칼럼에 테이블 레벨로 primary key 제약 조건을 지정하되 제약 조건 이름은 my_emp_pk로 지정하시오.
create table emp_sample
as
select * from employee
where 0 = 1;

alter table emp_sample
add constraint my_emp_pk primary key(eno);

select table_name, constraint_name
    from user_constraints
    where table_name in('EMP_SAMPLE');
    
--02.부서 테이블의 부서번호 칼럼에 테이블 레벨로 primary key 제약 조건을 지정하되 제약 조건 이름은 my_ dept_pk로 지정하시오.
desc emp_sample;

alter table emp_sample
drop primary key;

alter table emp_sample
add constraint my_dept_pk primary key(dno);

select table_name, constraint_name
    from user_constraints
    where table_name in('EMP_SAMPLE');
    
--03.사원 테이블의 부서번호 칼럼에 존재하지 않는 부서의 사원이 배정되지 않도록 외래 키 제약 조건을 
--지정하되 제약 조건 이름은 my_emp_dept_fk로 지정하시오.
alter table emp_sample
add constraint my_emp_dept_fk
foreign key(dno) references emp_sample(dno);

--04.사원 테이블의 커미션 칼럼에 0보다 큰 값만을 입력할 수 있도록 제약조건을 지정하시오.
alter table emp_sample
    add constraint emp_commission_chk check(commission > 0);
 
select * from emp_sample;
 
desc emp_sample;
 
insert into emp_sample
    values(4,'ddd','ddd',3,sysdate,1000,1,20);
    
    
    

    