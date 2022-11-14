--select * from usertbl;
--select * from buytbl;
--
--select *
--from usertbl
--inner join buytbl
--on usertbl.userid = buytbl.userid;
--
--select name,mobile1,mobile2,prodname,groupname,amount
--from usertbl
--inner join buytbl
--on usertbl.userid = buytbl.userid;
--
--
--select usertbl.userid, name,mobile1,mobile2,prodname,groupname,amount
--from usertbl
--inner join buytbl
--on usertbl.userid = buytbl.userid;
--
--select U.userid, U.name,U.mobile1,U.mobile2,B.prodname,B.groupname,amount
--from usertbl U
--inner join buytbl B
--on U.userid = B.userid;
--
--select U.userid, U.name,U.mobile1,U.mobile2,B.prodname,B.groupname,amount
--from usertbl U
--inner join buytbl B
--on U.userid = B.userid
--where amount>=5
--order by U.name;
--
---- 바비킴의 userid,birthyear,prodname,groupname을 출력하세요
--
--select U.userid,birthyear,prodname,groupname
--from usertbl U
--inner join buytbl B
--on U.userid = B.userid
--where U.name='바비킴';
--
--select concat(mobile1,mobile2) from usertbl;
--select mobile1 ||'-'|| mobile2 from usertbl;
--
--
---- amount*price 값이 100이상인 행의 name,addr,prodname,mobile1-mobile2 를 출력하세요
---- ( concat()함수사용해봅니다 - 오라클 concat찾아볼것)
--select name,addr,prodname, 
--case  when mobile1 is not null then mobile1 ||'-'||mobile2 end case 
--from usertbl U
--inner join buytbl B
--on U.userid = B.userid;
--
---- groupname이 전자인 행의 userid,name,birthyear,prodname을 출력하세요
--select usertbl.userid,name,birthyear,prodname 
--from usertbl
--inner join buytbl
--on usertbl.userid = buytbl.userid
--where groupname='전자';
--
--
--select * 
--from usertbl U
--left outer join buytbl B
--on U.userid=B.userid;
--
--
--select * 
--from buytbl B
--right outer join usertbl U
--on U.userid=B.userid;
--
--alter table buytbl drop constraint SYS_C007009;
--commit;


-- 동아리 코드 가져오기 
-- [학생Tbl]

drop table stdTbl;
drop table clubTbl;
drop table stdclubTbl;
commit;


CREATE TABLE stdTbl(
	stdName CHAR(10) NOT NULL PRIMARY KEY,
	addr CHAR(10) NOT NULL
);
-- [동아리Tbl]
CREATE TABLE clubTbl(
	clubName CHAR(10) NOT NULL PRIMARY KEY,
	roomNo CHAR(10) NOT NULL
);
-- [학생동아리Tbl]
CREATE TABLE stdclubTbl(
	num INT PRIMARY KEY,
	stdName CHAR(10) NOT NULL,
	clubName CHAR(10) NOT NULL,
    FOREIGN KEY(stdName) REFERENCES stdtbl(stdName),
	FOREIGN KEY(clubName)REFERENCES clubTbl(clubname)
);
INSERT INTO stdTbl VALUES('김범수','경남');
INSERT INTO stdTbl values('성시경','서울');
INSERT INTO stdTbl values('조용필','경기');
INSERT INTO stdTbl values('은지원','경북');
INSERT INTO stdTbl values('바비킴','서울');

INSERT INTO clubTbl VALUES('수영','101호');
INSERT INTO clubTbl VALUES('바둑','102호');
INSERT INTO clubTbl VALUES('축구','103호');
INSERT INTO clubTbl VALUES('봉사','104호');

INSERT INTO stdclubTbl VALUES(1,'김범수','바둑');
INSERT INTO stdclubTbl VALUES(2,'김범수','축구');
INSERT INTO stdclubTbl VALUES(3,'조용필','축구');
INSERT INTO stdclubTbl VALUES(4,'은지원','축구');
INSERT INTO stdclubTbl VALUES(5,'은지원','봉사');
INSERT INTO stdclubTbl VALUES(6,'바비킴','봉사');

select * from stdtbl;
select * from clubtbl;
select * from stdclubtbl;


select * 
from stdtbl S
inner join stdclubtbl SC
on S.stdname=SC.stdname
inner join clubtbl C
on SC.clubname = C.clubname;


select * 
from stdtbl S
left outer join stdclubtbl SC
on S.stdname=SC.stdname
left outer join clubtbl C
on SC.clubname = C.clubname;

select * 
from stdtbl S
right outer join stdclubtbl SC
on S.stdname=SC.stdname
right outer join clubtbl C
on SC.clubname = C.clubname;

-- full outer join 

select * 
from stdtbl S
full outer join stdclubtbl SC
on S.stdname=SC.stdname
full outer join clubtbl C
on SC.clubname = C.clubname;


-- stdname clubname,roomno,addr 을 출력합니다
-- inner join 을 사용합니다.
create table tmp_01 as
select U.userid,name,birthyear,prodname,groupname,price,amount 
from usertbl U,buytbl B;

select * from tMp_01;

select * 
from usertbl U1,usertbl U2;


drop table emptbl;
create table emptbl(emp char(15), manager char(15), empTel varchar(15));
insert into emptbl values('나사장',null,'0000');
insert into emptbl values('재무실장','나사장','1111');
insert into emptbl values('김부장','재무실장','2222');
insert into emptbl values('이부장','재무실장','3333');
insert into emptbl values('이대리','김부장','4444');
insert into emptbl values('정대리','이부장','5555');
insert into emptbl values('지사원','이부장','6666');
insert into emptbl values('강사원','김부장','7777');


select * from emptbl;
-- 부하 직원별 직속상관의 연락처(Self Join)
select E1.emp as 직원명 , E1.manager 직속상관 ,E2.emptel 직속상관Tel
from emptbl E1 join emptbl E2
on E1.manager=E2.emp;

-- ---------------------------------------------------------------------

-- Equi Join ( = 를 사용하는 join)
select *
from usertbl U , buytbl B
where U.userid=B.userid;

select * 
from usertbl U
inner join buytbl B
on U.userid=B.userid;

-- Non-Equi Join( =  이외의 연산자를 사용하는 join)
select *
from usertbl U ,buytbl B
where U.userid=B.userid and B.amount >= 4;

-- Natural Join
--동일한이름을 갖는 컬럼은 모두 조인됨
select * from usertbl natural join buytbl; 

-- using
-- 지정된 이름을 갖는 컬럼만 조인됨
select * from usertbl join buytbl using (userid);

-- -------------------------------------------------------------------
[INNER JOIN]

select 열이름 
from 테이블A
inner join 테이블B
on 조건절

[LEFT OUTER JOIN]

select 열이름 
from 테이블A
left outer join 테이블B
on 조건절

[RIGHT OUTER JOIN]
select 열이름 
from 테이블A
right outer join 테이블B
on 조건절

[FULL OUTER JOIN]

select 열이름 
from 테이블A
full outer join 테이블B
on 조건절

[CROSS JOIN]

select * 
from 테이블A ,테이블B;

[SELF JOIN]

select 열이름
from 테이블A E1 join 테이블B E2
on 조건절;



-- ----------------
EQUI JOIN
NON-EQUI JOIN

NATURIAL JOIN

select * 
from stdtbl 
natural join stdclubtbl 
natural join clubtbl
where stdname='김범수';


USING JOIN
-- stdtbl, stdclubtbl, clubtbl;
select * 
from stdtbl 
join stdclubtbl using (stdname)
join clubtbl using(clubname);

-- -------------------------------------------------------------------------------
select * from usertbl;
select * from buytbl;

create or replace view view_01
as
select U.userid,name,birthyear,prodname,groupname,price,amount 
from usertbl U
inner join buytbl B
on U.userid=B.userid;

select * from view_01;

drop table a_tbl;
drop table b_tbl;

create table a_tbl
(
    col1 int primary key,
    col2 int,
    col3 int not null,
    col4 int
);

drop view View_03;

create or replace view  view_01
as
select col1,col3 from a_tbl;

select * from view_01;

insert into view_01 values(10,20);
insert into view_01 values(30,40);
select * from view_01;
select * from a_tbl;


create or replace view  view_02
as
select col2,col4 from a_tbl;

insert into view_02 values(11,21);
insert into view_02 values(31,41);

create or replace view  view_01
as
select col1,col3 from a_tbl
with read only;

insert into view_01 values(7,8);
-- -----------------------------------------------------------------
SET serveroutput ON;

BEGIN
    dbms_output.put_line('HELLO WORLD');
END;

declare
    var1 int:=10;
    var2 int:=20;
BEGIN
    dbms_output.put_line('합 : ' || (var1+var2));
END;

select * from buytbl;
desc buytbl;

declare
    var1 buytbl.price%TYPE := 100;
    var2 buytbl.amount%TYPE := 200;
BEGIN
    dbms_output.put_line('합 : ' || (var1));
END;

declare
    var1 buytbl.price%TYPE;
    var2 buytbl.amount%TYPE;
BEGIN
    select price,amount into var1,var2 from buytbl where price=1000;
    dbms_output.put_line('var1 : ' || var1 || ' var2 : ' || var2);
END;

select price,amount from buytbl where price=1000;


declare
    n int :=1;
BEGIN
    if n>=5 then
        dbms_output.put_line('5보다 큼');
    elsif n>=3 then
        dbms_output.put_line('3보다 큼');
    else
        dbms_output.put_line('3보다 작음');
    end if;
END;

declare
    n int :=15;
BEGIN
    case 
    when n<10 then
        dbms_output.put_line('10보다 작음');
    when n<20 then
        dbms_output.put_line('10보다 크고 20보다는 작음');
    else
        dbms_output.put_line('20보다 큼');
    end case;
END;


select userid,price,amount,
case 
    when amount <= 1 then '일반'
    when amount <= 5 then '우수'
    when amount <=10 then 'VIP'
end case
from buytbl;


declare
    n int :=1;
begin
    while(n<10)
    loop
        dbms_output.put_line('n : ' || n);
        n:=n+1;
    end loop;
end;



begin
    for i in 1..9 
    loop
        dbms_output.put_line('i : ' || i);
    end loop;
end;

-- for, while  2 x 1 ~ 2 x 9 

begin
    for i in 1..9 
    loop
        dbms_output.put_line('2 x '|| i ||' = '||(2*i));
    end loop;
end;


-- 1 문제
declare
    i int := 100; j int := 200; hap int := 0;
    sub int := 0; mul int :=0; div int := 0;
begin
    -- i + j = hap
    -- i - j = sub
    -- i * j = mul
    -- i / j = div
    hap:=i+j;
    dbms_output.put_line(i ||' + ' || j || ' = ' || hap);
end;
-- 2 문제
drop table test_01 cascade constraints;
create table test_01 (
    no int,
    name varchar(20)
);
begin
    -- test_01 테이블에 1부터 100까지 반복하여 1 이름없음 / 2 이름없음 / 3 이름없음 ... 100 이름없이 
    -- 이 저장될수 있도록 해봅니다.
    for i in 1..100
    loop
        insert into test_01 values(i,'이름없음'||i);
    end loop;
end;
select * from test_01;

-- ------------------------------------------
create table tmp2_tbl as select userid,birthyear 
from usertbl where 1=2;
select * from tmp2_tbl;
desc tmp2_tbl;


declare 
    userid usertbl.userid%TYPE;
    birthyear usertbl.birthyear%TYPE;
    CURSOR CUR_01
    IS
    select 
    userid,birthyear 
    from 
    usertbl;
begin
 open CUR_01;   -- 커서열기
 Loop
    Fetch CUR_01 into userid,birthyear;   -- 커서에서 데이터 가져오기
    exit when CUR_01 %NOTFOUND; --커서가 없을 경우 종료
    
    if birthyear>=1970 then
       insert into tmp2_tbl values(userid,birthyear);
    end if;
 end Loop;
 CLOSE CUR_01;  --커서닫기
end;

select * from tmp2_tbl;



select * from usertbl;

alter table buytbl add grade varchar(25);

select * from buytbl;

declare 
    n buytbl.num%TYPE;
    price buytbl.price%TYPE;
    amount buytbl.amount%TYPE;
    CURSOR CUR_01
    IS
    select 
    num,price,amount
    from 
    buytbl;
begin
 open CUR_01;   -- 커서열기
 Loop
    Fetch CUR_01 into n,price,amount;   -- 커서에서 데이터 가져오기
    exit when CUR_01 %NOTFOUND; --커서가 없을 경우 종료
    
    if price*amount<=50 then
        dbms_output.put_line('일반고객');
        update  buytbl set grade='일반고객' where num=n;
    elsif price*amount<=100 then
        dbms_output.put_line('우수고객');
        update  buytbl set grade='우수고객' where num=n;
    else
        dbms_output.put_line('VIP');
         update  buytbl set grade='VIP' where num=n;
    end if;
 end Loop;
 CLOSE CUR_01;  --커서닫기
end;

select * from buytbl;







 
select userid,price,
case when amount<3 then 'a'
	 when amount<7 then 'b'
end case
from buytbl;
 




















