---- -------------------------
---- DDL
---- -------------------------
---- 1) 테이블 추가
--create table tmp_tbl(
-- col1 int primary key,
-- col2 int,
-- col3 int
--);
--select * from tmp_tbl;
--desc tmp_tbl;
--
---- 2) 열추가
--alter table tmp_tbl add (col4 int);
--desc tmp_tbl;
---- 3) 열변경(자료형)
--alter table tmp_tbl modify(col1 varchar(10));
--desc tmp_tbl;
---- 4) 열변경(이름변경)
--alter table tmp_tbl rename column col1 to column1;
--desc tmp_tbl;
---- 5) 열삭제
--alter table tmp_tbl drop column col2;
--desc tmp_tbl;
--
---- ---------------------------------------------
---- UserTbl 만들기
--CREATE TABLE userTbl( -- 회원테이블
--userID CHAR(8) NOT NULL PRIMARY KEY, -- 사용자아이디
--name VARCHAR(10) NOT NULL, -- 이름
--birthYear INT NOT NULL, -- 출생년도
--addr NCHAR(2) NOT NULL, --지역(2글자만 입력, 경남,서울,경기..)
--mobile1 CHAR(3), -- 휴대폰의 국번(011,016...)
--mobile2 CHAR(8), -- 휴대폰의 나머지 전화번호
--height SMALLINT, -- 키
--mDate DATE --회원가입일
--);
--
---- Buytbl 만들기
--CREATE TABLE buyTbl( -- 회원 구매 테이블
--num INT NOT NULL PRIMARY KEY, -- 순번(PK) 
--userID CHAR(8) NOT NULL, --
--prodName CHAR(15) NOT NULL, -- 물품명
--groupName CHAR(15), -- 분류
--price INT NOT NULL, -- 단가
--amount SMALLINT NOT NULL, -- 수량
--FOREIGN KEY (userID) REFERENCES userTbl(userID)
--);
--
---- Usertbl 값삽입
--INSERT INTO userTbl VALUES('LSG','이승기',1987,'서울','011','1111111',182,'2008-8-8');
--INSERT INTO userTbl VALUES('KBS','김범수',1979,'경남','011','2222222',173,'2012-4-4');
--INSERT INTO userTbl VALUES('KKH','김경호',1971,'전남','019','3333333',177,'2007-7-7');
--INSERT INTO userTbl VALUES('JYP','조용필',1950,'경기','011','4444444',166,'2009-4-4');
--INSERT INTO userTbl VALUES('SSK','성시경',1979,'서울',NULL,NULL,186,'2013-12-12');
--INSERT INTO userTbl VALUES('LJB','임재범',1963,'서울','016','6666666',182,'2009-9-9');
--INSERT INTO userTbl VALUES('YJS','윤종신',1969,'경남',NULL,NULL,170,'2005-5-5');
--INSERT INTO userTbl VALUES('EJW','은지원',1972,'경북','011','8888888',174,'2014-3-3');
--INSERT INTO userTbl VALUES('JKW','조관우',1965,'경기','018','9999999',172,'2010-10-10');
--INSERT INTO userTbl VALUES('BBK','바비킴',1973,'서울','010','0000000',176,'2013-5-5');
--
--select * from usertbl;
--
---- Buytbl 값 삽입
--
--INSERT INTO buyTbl VALUES(1,'KBS','운동화',NULL,30,2);
--INSERT INTO buyTbl VALUES(2,'KBS','노트북','전자',1000,1);
--INSERT INTO buyTbl VALUES(3,'JYP','모니터','전자',200,1);
--INSERT INTO buyTbl VALUES(4,'BBK','모니터','전자',200,5);
--INSERT INTO buyTbl VALUES(5,'KBS','청바지','의류',50,3);
--INSERT INTO buyTbl VALUES(6,'BBK','메모리','전자',80,10);
--INSERT INTO buyTbl VALUES(7,'SSK','책','서적',15,5);
--INSERT INTO buyTbl VALUES(8,'EJW','책','서적',15,2);
--INSERT INTO buyTbl VALUES(9,'EJW','청바지','의류',50,1);
--INSERT INTO buyTbl VALUES(10,'BBK','운동화',NULL,30,2);
--INSERT INTO buyTbl VALUES(11,'EJW','책','서적',15,1);
--INSERT INTO buyTbl VALUES(12,'BBK','운동화',NULL,30,2);
--
--
--select * from buytbl;
--select * from usertbl;
---- --------------------------------------------
--select * from usertbl;
--select * from usertbl where name='김경호';
--
--select * from usertbl where birthyear >= 1970 and height>=180;
--select * from usertbl where birthyear between 1970 and 1980;
--select * from usertbl where birthyear >=1970 and birthyear <=1980;
--select * from usertbl where birthyear >= 1970 or height>=180;
--
--select name,height,addr from usertbl where addr in ('경남','전남','경북');
--
--select * from usertbl where name like '김%';
--select * from usertbl where name like '%기';
--select * from usertbl where name like '김__';
--select * from usertbl where name like '%김%';
--
--
---- 문제
--select * from tbl_pump;
--
--select * from buytbl where amount>=5;
--
--select * from buytbl where price between 50 and 500;
--select * from buytbl where price >= 50 and price <=500;
--select * from buytbl where amount >=10 or price >=100;
--select * from buytbl where userid like 'K%';
--select * from buytbl where groupname in ('서적','전자');
--select * from buytbl where prodname='책' or userid like '%W';
--select * from tbl_pump where 소재지지번주소 like '%매곡리%';
--

-- 김경호 보다 큰 키라면 모두 출력
select * from usertbl where height>=(select height from usertbl where name='김경호') and name <> '김경호';
-- 임재범보다 나이가 적은 행들을 출력
select * from usertbl where birthyear>(select birthyear from usertbl where name='임재범');

-- 경남 지역의 키보다 큰 행을 출력
select * from usertbl where height> any(select height from usertbl where addr='경남');
select * from usertbl where height> all(select height from usertbl where addr='경남');


--문제
select * from buytbl where price>(select price from buytbl where amount=10);
select * from buytbl where amount> any(select amount from buytbl where userid like 'K%');
select * from buytbl where price >(select price from buytbl where amount=5);


select * from usertbl order by mdate;
select * from usertbl order by mdate desc;
select * from usertbl order by birthyear asc, name desc;

select distinct addr from usertbl order by addr;

select *  from (select rownum as RN, usertbl.* from usertbl) where RN>=2 and RN<=4;

-- 테이블 구조 + 데이터
create table buytbl2 as select * from buytbl;
select * from buytbl2;
desc buytbl2;

-- 구조만
create table buytbl3 as select * from buytbl where 1=2;
select * from buytbl3;
desc buytbl3;

insert into buytbl3 select * from buytbl;
select * from buytbl3;


-- 문제
select * from buytbl order by userid;
select * from buytbl order by price desc;
select * from buytbl order by amount asc,prodname desc;
select distinct prodname from buytbl order by prodname;
select distinct userid from buytbl;
select * from buytbl where amount>=3 order by prodname desc;

create table cusertbl as select * from usertbl where addr in ('서울','경기');

select * from cusertbl;
















