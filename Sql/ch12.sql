select sequence_name, min_value, max_value,
        increment_by, cycle_flag
        from user_sequences;
        
create sequence sample_seq
    increment by 10
    start with 10;
    
create table dept
as
select * from department
where 0 = 1;

desc dept;
select * from dept;

create SEQUENCE dno_seq
    increment by 10;
    
insert into dept
values (dno_seq.nextval , '영어', '대구');

create table emp_bbs(
                    num number(4) primary key,
                    title varchar2(20) not null,
                    contents varchar2(200));

create SEQUENCE seq_emp_num1
    increment by -1
    maxvalue 100
    minvalue 1
    start with 100;
 
select * from emp_bbs; 
                    
insert into emp_bbs
    values (seq_emp_num.nextval, '제목1','내용1');
insert into emp_bbs
    values (seq_emp_num.nextval, '제목2','내용2');
insert into emp_bbs
    values (seq_emp_num.nextval, '제목3','내용3');
    
select seq_emp_num1.nextval from dual;

drop sequence seq_emp_num;

create index idx_employee_ename
    on employee(ename);

drop index idx_employee_ename;

select index_name, table_name, column_name
    from user_ind_columns
    where table_name in ('EMPLOYEE');


