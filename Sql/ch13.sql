create user scott2
    identified by 1234;
    
select * from all_users;

GRANT CREATE SESSION TO scott2;

grant select on scott.employee to scott2;

revoke select on scott.employee from scott2;
revoke create session from scott2;

grant create session to scott2;

grant select on scott.employee to scott2 with grant option;

create user scott3 
    identified by 1234;
    
grant create session to scott3;

create user scott4
    identified by 1234;

grant connect to scott4;
grant resource to scott4;
grant select on scott.employee to scott4;

create public synonym my_emp for
    scott.employee;
    

