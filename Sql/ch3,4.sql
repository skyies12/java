select 'Oracle maina', 
    upper('Oracle maina'), 
    lower('Oracle maina'),
    initcap('oracle maina')
    from dual;
    
select * from employee
        where lower(ename) = 'scott';
        
select length('Oraclemaina'), length('오라클매니아')
    from dual;
    
select lengthb('Oraclemaina'), lengthb('오라클매니아')
    from dual;
    
--문자열을 결합하는 함수
select 'Oracle', 'mania', concat('Oracle', 'mania')
    from dual;
    
select ename, job, concat(initcap(ename), initcap(job))
    from employee;
    
--기존 문자열에서 일부를 가져오는 함수
select substr('Oracle mania', 4, 3),
        substrb('Oracle mania', 4, 3)
        from dual;
        
select substr('오라클매니아', 3, 4),
        substrb('오라클매니아', 3, 4)
        from dual;
--첫 글자만 가져오기     
select substr(ename, 1,1) from employee;

select ename from employee
    order by length(ename), ename asc;
 
--문자열 내에 해당 문자가 어느 위치에 존재하는지를 알려 줌    
select instr('Oracle mania', 'o', 1) from dual;

select substr('Oracle mania', 1,instr('Oracle mania', 'a'))  from dual;

--칼럼이나 대상 문자열을 명시된 자릿수에서 오른쪽에 나타내고,
--남은 왼쪽 자리를 특정 기호로 채움
select ename, lpad(salary, 10, '*') from employee;

--칼럼이나 대상 문자열에서 특정 문자가 첫 번째 글자이거나 마지막 글자이면 잘라내고
--남은 문자열만 반환
select  trim('   Oracle mania   ') from dual;

--concat 문자
select '#'|| trim('   Oracle mania   ') ||'#' from dual;

--특정 자릿수에서 반올림한다.
select 98.7654,
        round(98.7654),
        round(98.7654, 2),
        round(98.7654, -1)
        from dual;

--특정 자릿수에서 잘라낸다.
select 98.7654,
        trunc(98.7654),
        trunc(98.7654, 2),
        trunc(98.7654, -1)
        from dual;

--SYSDATE 함수는 시스템에 저장된 현재 날짜를 반환하는 함수
select sysdate from dual;

--날짜 형 데이터에 숫자를 더하면(날짜+숫자) 그 날짜로부터 그 기간만큼 지난
--날짜를 계산. 날짜 형 데이터에 숫자를 빼면(날짜-숫자) 그 날짜로부터 그 기간만큼
--이전 날짜를 구한다.
select sysdate-1 어제,
        sysdate 오늘,
        sysdate+1 내일
        from dual;

--날짜에 대한 반올림을 할 수 있다.
select round(sysdate-hiredate) 근무일수 from employee;

--날짜를 잘라낼 수 있다.
select hiredate, trunc(hiredate, 'day') from employee;

--MONTHS_BETWEEN 한수는 날짜와 날짜 사이의 개월 수를 구하는 함수
select ename, sysdate, hiredate,
        trunc(months_between (sysdate, hiredate)) as "근무개월"
        from employee;

--특정 개월 수를 더한 날짜를 구하는 함수
select ename, hiredate,
        add_months(hiredate, 6)
        from employee;

--해당 날짜를 기준으로 최초로 도래하는 요일에 해당되는 날짜를 반한하는 함수
select sysdate,
        next_day(sysdate, '금요일')
        from dual;

--해당 날짜가 속한 달의 마지막 날짜를 반환하는 함수
select ename, hiredate,
    last_day(hiredate)
    from employee;


select ename, hiredate,
    to_char(hiredate, 'YY-MM'),
    to_char(hiredate, 'YYYY/MM/DD DAY')
    from employee;

--문자열을 날짜 형으로 변환한다.
select ename, hiredate
    from employee
    where hiredate=to_date('19810219'+1,'YYYY-MM-DD');
    
--특정 데이터를 숫자형으로 변환해 주는 함수    
select to_number('100000') - to_number('50000')
    from dual;

select ename, salary,
        nvl(commission, 0),
        salary*12+nvl(commission, 0)
        from employee
        order by job;

select ename, salary, commission,
        NVL(commission, 0),
        NVL2(commission, salary*12+commission, salary*12)
        from employee;

--두 표현식을 비교하여 동일한 경우에는 널을 반환하고 동일하지 않으면
--첫 번째 표현식을 반환
select nullif('A','A'), nullif('A','B')
    from dual;

--인수 중에서  NULL이 아닌 첫 번째 인수를 반환
select ename, salary, commission,
        coalesce(commission+salary, salary, 0)
        from employee
        order by job;

--조건에 따라 다양한 선택이 가능
select ename, dno,
        decode(dno, 10, 'ACCOUNTING',
                    20, 'RESEARCH',
                    30, 'SALES',
                    40, 'OPERATIONS',
                    'DEFAULT') as DNAME
        from employee
        order by dno;

--프로그램 언어의 if else if else와 유사한 구조
select ename, dno,
        case when dno=10 then 'ACCOUNTING'
            when dno=20 then 'RESEARCH'
            when dno=30 then 'SALES'
            when dno=40 then 'OPERATIONS'
            else 'DEFAULT'
        end as DNAME
    from employee
    order by dno;
    
    