--01.SUBSTR 함수를 사용하여 사원들의 입사한 년도와 입사한 달만 출력하시오.
select ename 이름, hiredate 입사날짜, 
    substr(hiredate, 1,2) "입사한 년도",
    substr(hiredate, 4,2) "입사한 달"
    from employee;
    
--02.SUBSTR 함수를 사용하여 4월에 입사한 사원을 출력하시오.
select hiredate from employee;

select * from employee 
    where substr(hiredate,4, 2)='04';
    
--03.MOD 함수를 사용하여 사원번호가 짝수인 사람만 출력하시오.
desc employee;

select * from employee
     where mod(eno, 2)=0;

--04.입사일을 연도는 2자리(YY), 월은 숫자(MON)로 표시하고 요일은 약어(DY)로 지정하여 출력하시오.
select to_char(hiredate, 'YY-mon-dy') 입사일
    from employee;

--05.올해 며칠이 지났는지 출력하시오. 현재 날짜에서 올해 1월 1일을 뺀 결과를 출력하고
--TO_DATE 함수를 사용 하여 데이터 형을 일치 시키시오.
select trunc(sysdate - to_date(20190101, 'yyyymmdd')) as "올해 지난 날짜"
        from dual;

--06.사원들의 상관 사번을 출력하되 상관이 없는 사원에 대해서는 NULL 값 대신 0으로 출력하시오.
select * from employee;

select eno, ename,
        nvl(manager, 0) as 사번
        from employee;

--07.DECODE 함수로 직급에 따라 급여를 인상하도록 하시오. 
--직급이 ‘ANALYST’인 사원은 200, ‘SALESMAN’ 인 사원은 180, ‘MANAGER’인 사원은 150, ‘CLERK’인 사원은 100을 인상하시오.
select job from employee;

select job 직급, salary 급여, 
    decode(job, 'ANALYST', salary+200,
                'SALESMAN', salary+180,
                'MANAGER', salary+150,
                'CLERK', salary+100,
                'PRESIDENT', salary) 
                as "인상된 급여"
    from employee
    order by job asc;

