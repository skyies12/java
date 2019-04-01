set serveroutput on
declare
    v_eno number(4);
    v_ename employee.ename%type;
begin
    v_eno := 7788;
    v_ename := 'SCOTT';
    dbms_output.put_line('사원번호 사원이름');
    dbms_output.put_line('---------------');
    dbms_output.put_line(v_eno ||' ' || v_ename);
    end;
    /

-- 사원번호와 사원이름 출력하기    
set serveroutput on
declare
    v_eno employee.eno%type;
    v_ename employee.ename%type;
begin
    dbms_output.put_line('사원번호 사원이름');
    dbms_output.put_line('---------------');
    
    select eno, ename into v_eno, v_ename
    from employee
    where ename = 'KING';

    dbms_output.put_line(v_eno ||' ' || v_ename);
    end;
    /  
    
set serveroutput on
declare
    v_employee employee%rowtype;
    temp number(4) := 1;
    annsal number(7, 2);
    
begin
    select * into v_employee
    from employee
    where ename = 'SCOTT';
    
    if (v_employee.commission is null) then
        v_employee.commission := 0;
    end if;
    
    annsal := v_employee.salary * 12 + v_employee.commission;
    
    dbms_output.put_line('사원번호    사원이름    연봉');
    dbms_output.put_line('-------------------------');
    dbms_output.put_line(v_employee.eno || '  ' || v_employee.ename || '  '  || annsal);
    end;
    /
    
set serveroutput on
declare
    v_eno employee.eno%type;
    v_ename employee.ename%type;
    v_dno employee.dno%type;
    v_dname varchar2(20) := null;

begin
    select eno, ename, dno 
    into v_eno, v_ename, v_dno
    from employee
    where ename = 'SCOTT';
    
    if(v_dno = 10)
        then v_dname := 'ACCOUNTING';
    elsif(v_dno = 20)
        then v_dname := 'RESEARCH';
    elsif(v_dno = 30)
        then v_dname := 'SALES';
    elsif(v_dno = 40)
        then v_dname := 'OPERATIONS';
    end if;
    
    dbms_output.put_line('사원번호   사원이름   부서명');
    dbms_output.put_line(v_eno || '  ' || v_ename || '  '  || v_dname);
    
    end;
    /
    
 
 -- loop문을 이용하여 구구단 2단 출력하기
 
set serveroutput on
declare
    dan number := 2;
    i number := 1;

begin
    loop
        dbms_output.put_line(dan || ' X ' || i || ' = ' || (dan*i));
        i := i+1;
        if (i > 9) then
            exit;
        end if;
    end loop;
 end;
 /
 
 
set serveroutput on
declare
    dan number := 2;
    i number := 1;

begin
    for dan in 2 .. 9 loop
        for i in 1 .. 9 loop
            dbms_output.put_line(dan || ' X ' || i || ' = ' || (dan*i));
        end loop;
        dbms_output.new_line();
    end loop;
end;
/
 
 
 set serveroutput on
 declare
    dan number := 2;
    i number := 1;
begin
    while i <= 9 loop
        dbms_output.put_line(dan || ' X ' || i || ' = ' || (dan*i));
        i := i + 1;
    end loop;
end;
/
 
    
    
set serveroutput on
declare
    v_dept department%rowtype;
    cursor c1
    is
    select * from department;
    
begin
    dbms_output.put_line('부서번호   부서명   지역명');
    dbms_output.put_line('------------------------');
    
    open c1;
    loop
        fetch c1 into v_dept.dno, v_dept.dname, v_dept.loc;
        exit when c1%notfound;
        dbms_output.put_line(v_dept.dno || '  ' || v_dept.dname || '  '  || v_dept.loc);
    end loop;
    close c1;
end;
/
        
    
set serveroutput on
declare
    v_dept department%rowtype;
    cursor c1
    is
    select * from department;
    
begin
    dbms_output.put_line('부서번호   부서명   지역명');
    dbms_output.put_line('------------------------');
    
    for v_dept in c1 loop
        exit when c1%notfound;
        dbms_output.put_line(v_dept.dno || '  ' || v_dept.dname || '  '  || v_dept.loc);
    end loop;
end;
/    

--01.IF 문을 사용하여 KING 사원의 부서번호를 얻어 와서 부서번호에 따른 부서명을 출력하시오.
set serveroutput on
declare
    v_employee employee%rowtype;
    v_dname varchar2(20);
begin
    select * into v_employee
    from employee
    where ename = 'KING';
    
    if(v_employee.dno = 10)
        then v_dname := 'ACCOUNTING';
    elsif(v_employee.dno = 20)
        then v_dname := 'RESEARCH';
    elsif(v_employee.dno = 30)
        then v_dname := 'SALES';
    elsif(v_employee.dno = 40)
        then v_dname := 'OPERATIONS';
    end if;
    
    dbms_output.put_line('사원이름   부서명');
    dbms_output.put_line(v_employee.ename || '   ' || v_dname);
end;
/
    
    
    
--02.BASIC LOOP 문으로 1부터 10 사이의 자연수의 합을 구하여 출력하시오.
set serveroutput on
declare
    i number := 1;
    j number := 0;
begin
    loop
        j := j + i;
        i := i + 1;
        
        if (i > 10)
            then exit;
        end if;
    end loop;
    dbms_output.put_line('1부터 10까지의 합 : ' || j);
end;
/
    
--03.FOR LOOP 문으로 1부터 10 사이의 자연수의 합을 구하여 출력하시오.
set serveroutput on
declare
    j number := 0;
begin
    for i in 1 .. 10 loop
        j := j + i;
    end loop;
    dbms_output.put_line('1부터 10까지의 합 : ' || j);
end;
/
--04.WHILE LOOP 문으로 1부터 10 사이의 자연수의 합을 구하여 출력하시오.
set serveroutput on
declare
    i number := 1;
    j number := 0;
begin
    while i <= 10 loop
        j := j + i;
        i := i + 1;
    end loop;
    dbms_output.put_line('1부터 10까지의 합 : ' || j);
end;
/
--05.사원 테이블에서 커미션이 NULL이 아닌 상태의|
--사원번호, 이름, 급여를 이름 기준 오름차순으로 정렬한 결과 를 출력하시오.
set serveroutput on
declare
    v_employee employee%rowtype;
    cursor c1
    is
    select * from employee
    where commission is not null
    order by ename desc;
begin
    dbms_output.put_line('사원번호' || '  ' || '이름' || '  ' || '급여');
    for v_employee in c1 loop
        exit when c1%notfound;
        dbms_output.put_line(v_employee.eno || '  ' || v_employee.ename || '  ' || v_employee.salary);
    end loop;
end;
/
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    