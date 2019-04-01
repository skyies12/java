select dno
    from employee
    where eno = 7788;
    
select dname
    from department
    where dno=20;
    
select employee.dno, department.dname
    from employee, department;

select * from employee,department;

select * from department;

select * from employee;

-- 동등 조인, 각 사원들이 소속된 부서 정보 얻기
select *
    from employee,department
    where employee.dno = department.dno
    and employee.eno = 7788;
    
select ename, eno, dname, employee.dno
    from employee,department
    where employee.dno = department.dno
    and employee.eno = 7788;

--WHERE 절에 모호성을 방지하기 위해서 칼럼명 앞에 테이블 명을 명시
select employee.eno, employee.ename,
        department.dname, employee.dno    
    from employee, department
    where employee.dno = department.dno
    and employee.eno = 7788;

--from 절에서 테이블명 다음에 공백을 두고 별명을 정의        
select e.eno, e.ename, d.dname, e.dno
    from employee e, department d
    where e.dno = d.dno
    and e.eno = 7788;
    
select eno, ename, dname, dno
    from employee natural join department
    where eno = 7788; 
    
select e.eno, e.ename, d.dname, dno
    from employee e join department d
    using (dno)
    where e.eno = 7788;    
    
select e.eno, e.ename, d.dname, e.dno
    from employee e join department d
        on e.dno = d.dno
    where e.eno = 7788;

select * from salgrade;
    
select ename, salary, grade
    from employee, salgrade
    where salary between losal and hisal;
    
 select e.ename, d.dname, e.salary, s.grade
    from employee e, department d, salgrade s
    where e.dno = d.dno
    and salary between losal
    and hisal;
    
select eno, ename, manager
    from employee
    where eno = 7902;

select a.eno, a.ename, a.manager, b.eno, b.ename
    from employee a, TEST b
    where a.manager = b.eno;
    
    create table TEST
    as 
    select * from employee;
    
    select a.ename, a.manager, b.eno, b.ename 
    from employee a, employee b
    where a.manager(+) = b.eno;
    

select a.ename || '의 직속 상관은 '|| a.manager, b.eno, b.ename
    from employee a left outer join employee  b
on a.manager = b.eno;