--Chater 07_서브 쿼리
--
--01.사원번호가 7788인 사원과 담당 업무가 같은 사원을 표시(사원이름과 담당 업무)하시오.
select * from employee;

select ename, job
    from employee
    where job = (select job 
                from employee 
                where eno = 7788);

--02.사원번호가 7499인 사원보다 급여가 많은 사원을 표시(사원이름과 담당 업무)하시오.
select * from employee;

select ename, job, salary 
    from employee
    where salary > (select max(salary) from employee
                    where eno = 7499);

--03.최소 급여를 받는 사원의 이름, 담당 업무 및 급여를 표시하시오(그룹함수 사용).
select dno, ename, job, salary
    from employee
    where salary in (select min(salary)
                    from employee
                    group by dno)
    order by dno;

--04.평균 급여가 가장 적은 직급(job)과 평균 급여를 표시하시오.
select job, round(avg(salary)) as 급여
    from employee
    group by job
    having avg(salary) = (select min(avg(salary))
                    from employee
                    group by job);

--05.각부서의 최소 급여를 받는 사원의 이름, 급여, 부서번호를 표시하시오.
select dno, ename, salary
    from employee
    order by dno ;

select dno, ename, salary
    from employee
    where (dno,salary) in (select dno, min(salary)
                    from employee
                    group by dno)
    order by dno;

--06.담당 업무가 분석가(ANALYST)인 사원보다 급여가 적으면서 업무가 분석가(ANALYST)가 
--아닌 사원들을 표 시(사원번호, 이름, 담당업무, 급여)하시오.
select * from employee;

select eno, ename, job, salary
    from employee
    where job in (select job
                from employee
                where job != 'ANALYST')
    and salary < (select max(salary)
                    from employee
                    where job = 'ANALYST')
    order by salary;

--07.부하직원이 없는 사원의 이름을 표시하시오.
select * from employee;

select ename
    from employee
    where ename in (select ename 
                    from employee
                    where manager is null);
--08.부하직원이 있는 사원의 이름을 표시하시오.
select ename
    from employee
    where ename in (select ename 
                    from employee
                    where manager is not null);
--09.BLAKE와 동일한 부서에 속한 사원의 이름과 입사일을 표시하는 질의를 작성하시오(단. BLAKE는 제외).
select ename, hiredate, dno from employee
    where dno = 30;

select dno, ename, hiredate
    from employee
     where ename in (select b.ename
                    from employee a, employee b
                    where a.dno = b.dno 
                     and a.ename = 'BLAKE'
                     and b.ename != 'BLAKE');
--10.급여가 평균 급여 보다 많은 사원들의 사원번호와 이름을 표시하되 결과를 급여에 대해서 오름차순으로 정렬 하시오.
select avg(salary) from employee;

select eno, ename, salary
    from employee
    where salary > (select avg(salary)
                    from employee)
    order by salary;
                    
--11.이름에 K가 포함된 사원과 같은 부서에서 일하는 사원의 사원번호와 이름을 표시하는 질의를 작성하시오
select dno, eno, ename
    from employee
    where ename like '%K%';
    
select dno, eno, ename
    from employee
    where dno = 30;

select dno, eno, ename
    from employee
    where ename in (select b.ename
                    from employee a, employee b
                    where a.dno = b.dno
                    and a.ename like '%K%'
                    and b.ename not like '%K%');

--12.부서 위치가 DALLAS인 사원의 이름과 부서번호 및 담당 업무를 표시하시오.
select * from department;

select dno, ename, job
    from employee
    where dno in (select dno
                    from department
                    where loc = 'DALLAS');
--13.KING에게 보고하는 사원의 이름과 급여를 표시하시오.
select * from employee;

select ename, salary
    from employee
    where manager = (select eno
                    from employee
                    where ename = 'KING');
--14.RESEARCH 부서의 사원에 대한 부서번호 사원이름 및 담당 업무를 표시하시오.
select * from department;

select dno, ename, job
    from employee
    where dno = (select dno
                from department
                where dname = 'RESEARCH');
--15.평균 급여 보다 많은 급여를 받고 이름에 K가 포함된 사원과 같은 부서에서 근무하는 사원의 사원번호, 이름, 급여를 표시하시오.
select dno,eno, ename, salary
    from employee
    where salary > (select avg(salary)
                    from employee);

select dno,eno, ename, salary
    from employee
    where salary < (select avg(salary)
                    from employee)
    and dno in (select dno 
                from employee
                where ename like '%K%');

--16.평균 급여가 가장 적은 업무를 찾으시오.
select salary from employee;

select job, round(avg(salary)) as "급여"
    from employee
    group by job
    having avg(salary) in (select min(avg(salary))
                    from employee
                    group by job);
--17.담당 업무가 ANALYST인 사원이 소속된 부서와 동일한 부서의 사원을 표시하시오.
select job from employee;

select dno, ename, job
    from employee
    where dno in (select dno
                    from employee
                    where job = 'ANALYST')
                    
    and job != 'ANALYST';

desc zipcode2;
select 법정동명 from zipcode2
    where 법정동명 = '갈현동'
    group by 법정동명; 
