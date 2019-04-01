--그룹 함수
select sum(salary) as "급여총액",
        trunc(avg(salary), 2) as "급여평균",
        max(salary) as "최대급여",
        min(salary) as "최소급여",
        count(salary) as min
    from employee;
    
select 29025 / 14 from dual;

--그룹함수와 NULL 값
select sum(commission) as "커미션 총액"
    from employee;
    
--로우 개수 구하는 count 함수    
select count(*) as "사원의 수"
    from employee;
    
--중복되지 않은 직업의 개수
select count(distinct job) as "직업 종류의 개수"
    from employee;
    
--그룹함수와 단순 컬럼
select ename, max(salary)
    from employee;
--문제가 있다

--특정 칼럼을 기준으로 그룹별로 나눌 때 사용
select avg(salary) from employee;

select dno, trunc(avg(salary),0) as "급여 평균", max(salary), min(salary)
from employee
group by dno;

select dno, job, count(*), sum(salary) 
    from employee
    group by dno, job
    order by dno, job;
    
--그룹핑에 대한 결과
select dno, max(salary) from employee
    group by dno
    having max(salary) >= 3000;