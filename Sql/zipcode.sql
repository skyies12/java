desc zipcode;

select count(*) from zipcode;

select * from zipcode
    where rownum < 10;
    
--서울시에 모든 구의 이름을 구하시오
select 시군구 
    from zipcode
    group by 시군구
    order by 시군구 asc;

--서울시안의 모든 중학교를 구하시오
select * from zipcode;

select 시군구용건물명
    from zipcode
    where 시군구용건물명 like '%중학교%'
    order by 시군구용건물명;
    
--서울시안의 모든 성당을 구하시오
select 시군구용건물명
    from zipcode
    where 시군구용건물명 like '%성당%'
    order by 시군구용건물명;
    
--서울시안의 모든 국민은행을 구하시오
select 시군구용건물명
    from zipcode
    where 시군구용건물명 like '%국민은행%'
    order by 시군구용건물명;
   
--서울시의 모든 구와 구별 법정 동을 구하시오. 
select 시군구, 
    nvl(법정동명, 0) 법정동명
    from zipcode
    group by 법정동명, 시군구
    order by 시군구;

--모든 구별 법정동안의 중학교 개수를 구하시오
select 시군구 ,법정동명, count(*) as "중학교 개수"
    from zipcode
    where 시군구용건물명 like '%중학교%'
    group by 시군구, 법정동명
    order by 시군구, 법정동명;
   
   
    