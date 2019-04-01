   
select * from employee
    where dno = 20 order by salary desc;
    
--01.덧셈 연산자를 이용하여 모든 사원에 대해서 $300 의
--급여 인상을 계산한 후 사원의 이름, 급여, 인상된 급여를 출력하시오.
desc employee;
  
select ename "�̸�", salary "�޿�", salary+300 "�λ�� �޿�" from employee;

--02.사원의 이름, 급여, 연간 총수입을 총 수입이 많은 것부터 작은 순으로 출력하시오.
--연간 총수입은 월급에 12를 곱한 후 $100의 상여금을 더해서 계산하시오..

desc employee;

select ename "�̸�", salary "�޿�", salary*12+100 "���� �Ѽ���" 
    from employee order by (salary*12+100) desc;
    
--03.급여가 2000을 넘는 사원의 이름과 급여를 급여가 많은 것부터 작은 순으로 출력하시오.

select ename "�̸�", salary "�޿�" from employee 
    where salary > 2000 
    order by salary desc;
    
--04.사원번호가 7788인 사원의 이름과 부서번호를 출력하시오.
desc employee;

select ename "�̸�", dno "�μ���ȣ" from employee 
    where eno = 7788;

--05.급여가 2000에서 3000 사이에 포함되지 않는 사원의 이름과 급여를 출력하시오.
desc employee;

select ename "�̸�", salary "�޿�" from employee
    where salary not between 2000 and 3000;
    
--06.1981년 2월 20일부터 1981년 5월 1일 사이에 입사한 사원의 이름, 담당 업무, 입사일을 출력하시오.
desc employee;

select ename "�̸�", job "������", hiredate "�Ի糯¥" from employee
    where hiredate between '1981/02/20' and '1981/05/01';

--07.부서 번호가 20 및 30에 속한 사원의 이름과 부서번호를 출력하되 이름을 기준(내림차순)으로 영문자순으로 출력하시오.

desc employee;

select ename "�̸�", dno "�μ���ȣ" from employee
    where dno = 20 or dno = 30 order by ename asc;
    
--08.사원의 급여가 2000에서 3000 사이에 포함되고 부서번호가 
--20 또는 30인 사원의 이름, 급여와 부서번호를 출력하되 이름 순(오름차순)으로 출력하시오.
desc employee;

select ename "�̸�",salary "�޿�", dno "�μ���ȣ" from employee
    where salary between 2000 and 3000
    and dno in(20,30) 
    order by ename asc;


--09.1981년도에 입사한 사원의 이름과 입사일을 출력하시오(Iike 연산자와 와일드카드 사용).
desc employee;

select ename "�̸�", hiredate "�Ի糯¥" from employee;

select ename "�̸�", hiredate "�Ի糯¥" from employee
    where hiredate like '81%';


--10.관리자가 없는 사원의 이름과 담당 업무를 출력하시오.
desc employee;

select ename "�̸�", job "������" from employee
    where manager is null;

--11.커미션을 받을 수 있는 자격이 되는 사원의 이름, 급여, 
--커미션을 출력하되 급여 및 커미션을 기준으로 내림차순 정렬하여 표시하시오.
select ename "�̸�", salary "�޿�", commission "Ŀ�̼�" from employee
    where commission is not null
    order by salary desc, commission desc;

--12.이름의 세 번째 문자가 R인 사원의 이름을 표시하시오.
select ename "�̸�" from employee
    where ename like '__R%';


--13.이름에 A와 E를 모두 포함하고 있는 사원의 이름을 표시하시오. 
select ename from employee;

select ename from employee;
select ename "�̸�" from employee
    where ename like '%A%' 
    and ename like '%E%';

--14.담당 업무가 사무원(CLERK) 또는 영업사원(SALESMAN)이면서 급여가 $1600, $950 또는 $1300이 아닌 
--사원의 이름, 담당 업무, 급여를 출력하시오.
select ename "�̸�", job "������", salary "�޿�" from employee  
    where job in('CLERK', 'SALESMAN')
    and salary not in(1600,950,1300);


--15.커미션이 $500이상인 사원의 이름과 급여 및 커미션을 출력하시오.

select ename "�̸�", salary "�޿�", commission "Ŀ�̼�" from employee
    where commission >= 500;
    