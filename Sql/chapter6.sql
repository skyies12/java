--01.EQUI 조인을 사용하여 SCOTT 사원의 부서번호와 부서이름을 출력하시오.
select ename, employee.dno, department.dname 
    from employee, department
    where employee.dno = department.dno 
    and ename = 'SCOTT';

--02.INNER JOIN과 ON 연산자를 사용하여 사원이름과 함께 그 시원이 소속된 부서이름과 지역명을 출력하시오.
select a.ename, b.dname, b.loc
    from employee a join department b
        on a.dno = b.dno;

--03.INNER JOIN과 USING 연산자를 사용하여 10번 부서에 속하는 
--모든 담당 업무의 고유 목록(한 번씩만 표시)을 부서의 지역명을 포힘하여 출력하시오.
select dno, a.job, b.loc
    from employee a join department b
    using(dno)
    where dno = 10;

--04.NATURAL JOIN을 사용하여 커미션을 받는 모든 사원의 이름, 부서이름, 지역명을 출력하시오.
select ename, dname, loc, commission
    from employee a natural join department b
    where a.commission is not null and a.commission != 0;

--05.EQUI 조인과 WildCard를 사용하여 이름에 A가 포함된 모든 사원의 이름과 부서명을 출력하시오.
select ename, dname 
    from employee, department
    where employee.dno = department.dno
    and ename like '%A%';
    

--06.NATURAL JOIN을 사용하여 NEWYORK에 근무하는 모든 사원의 이름, 업무, 부서번호 및 부서명을 출력하시오.
select loc from department;

select ename, job, dno, dname
    from employee a natural join department b
    where b.loc = 'NEW YORK';

--07.SELFJOIN을 사용하여 사원의 이름 및 사원번호를 관리자 이름 및 관리자 번호와 함께 출력하시오. 
--단, 각열의 별칭은 결과 화면과 같도록 하시오.
--Employee Emp# Manager Mgr#
select * from employee;

select a.ename as "Employee", 
        a.eno "Emp#", 
        b.ename as "Manager" ,
        b.eno "Mgr#"
    from employee a, employee b
    where a.manager = b.eno;

--08.OUTER JOIN, SELF JOIN을 시용하여 관리자가 없는 사원을 포함하여 사원번호를 기준으로 내림차순 정렬 하여 출력하시오.
select * from employee;

select a.ename as "Employee",
    a.eno "Emp#",
    b.ename as "Manager" ,
    b.eno "Mgr#"
    from employee a, employee b
    where a.manager = b.eno(+)
    order by a.eno desc;

--09.SELF JOIN을 시용하여 지정한 사원의 이름, 부서번호, 
--지정한 사원과 동일한 부서에서 근무하는 사원을 출력 하시오. 단, 각 열의 별칭은 이름, 부서번호, 동료로 하시오.
select * from employee;

select a.ename 이름, a.dno 부서번호, b.ename 동료
    from employee a, employee b
    where a.ename = 'SMITH'
    and b.ename != 'SMITH'
    and a.dno = b.dno;


--10.SELF JOIN을 시용하여 WARD 사원보다 늦게 입사한 사원의 이름과 입사일을 출력하시오.
select b.ename, b.hiredate
    from employee a, employee b
    where a.hiredate < b.hiredate
    and a.ename = 'WARD'
    order by b.hiredate;
    
select ename, hiredate from employee;
select ename, hiredate
    from employee
    where hiredate > '1981/02/22'
    order by hiredate;
    
    select ename, hiredate,
    decode(ename,'WARD', hiredate > '1981/02/22')
        from employee;
    

--11.SELF JOIN을 사용하여 관리자보다 먼저 입사한 모든 사원의 이름 및 입사일을 관리자의 이름 및 입사일과 함께 출력하시오. 
--단, 각 열의 별칭은 결과 화면과 같도록 하시오.
--ENAME HIREDATE ENAME HIREDATE
select * from employee;

select a.ename as "ENAME",
        a.hiredate as "HIREDAE",
        b.ename as "ENAME",
        b.hiredate as "HIREDAE"
    from employee a, employee b
    where a.manager = b.eno;
