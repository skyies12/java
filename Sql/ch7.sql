select ename, salary
    from employee
    where salary > (select salary from employee where ename = 'SCOTT');
    
select ename, dno
    from employee
    where dno > (select dno from employee where ename = 'SCOTT');

--부서별 최소 급여를 찾고 해당 급여와 같은 급여를 받는 사원의 사원번호와 이름을 출력하는 퀴리문
select eno, ename
    from employee
    where salary in (select min(salary) 
                        from employee
                        group by dno);
                        
 --직급이 salesman이 아니면서 급여가 임의의 salesman 보다 낮은 사원을 출력                       
select eno, ename, job, salary
    from employee
    where salary < any (select salary
                        from employee
                        where job = 'SALESMAN')
    and job != 'SALESMAN';
    

select eno, ename, job, salary
    from employee
    where salary < all (select salary
                        from employee
                        where job = 'SALESMAN')
    and job != 'SALESMAN'; 
    
select translate(dno, 2, 'd'), translate(dno, 3, 's')
    from employee;
    
    
select 시도, 시군구, 도로명,
    TRANSLATE(도로명, '1234567890'||도로명, '1234567890') A,
       NVL(TRANSLATE(도로명, '1234567890'||도로명, '1234567890'), 0) B,
       TO_NUMBER(NVL(TRANSLATE(도로명, '1234567890'||도로명, '1234567890'), 0)) as order1
    from zipcode
    where 도로명 like '봉은사%'
    group by 시도, 시군구, 도로명
    order by order1;
    
select b.dno, b.dname
    from employee a, department b
    where a.dno = b.dno
    and a.ename = 'SCOTT'