


-- 커서
-- 커서를 만들어서 price*amount가 500이하인 groupname과 prodname을 
-- tmp3_tbl(prodname,groupname)에 저장하세요
-- 커서명 : CUR_02
-- tmp3_tbl의 열은 buytbl의 prodname,groupname을 테이블 복사로 처리합니다(구조만 복사)

drop table tmp3_tbl;
create table tmp3_tbl as select prodname,groupname from buytbl where 1=2;
select * from tmp3_tbl;
desc tmp3_tbl;

declare 
    price buytbl.price%TYPE;
    amount buytbl.amount%TYPE;
    prodname buytbl.prodname%TYPE;
    groupname buytbl.groupname%TYPE;
    CURSOR CUR_02
    IS
    select 
    price,amount,prodname,groupname
    from 
    buytbl;
begin
 open CUR_02;   -- 커서열기
 Loop
    Fetch CUR_02 into price,amount,prodname,groupname;   -- 커서에서 데이터 가져오기
    exit when CUR_02 %NOTFOUND; --커서가 없을 경우 종료
    if price*amount<=500 then
        insert into tmp3_tbl values(prodname,groupname);
    end if;
 end Loop;
 CLOSE CUR_02;  --커서닫기
end;


-- 프로시저
SET serveroutput ON;

drop procedure Proc01;
create or replace PROCEDURE Proc01
IS
    START_MESSAGE VARCHAR2(100) := '------test_START----------';
    END_MESSAGE VARCHAR2(100) := '-------test_END------------';
BEGIN
    DBMS_OUTPUT.PUT_LINE(START_MESSAGE);
    DBMS_OUTPUT.PUT_LINE(END_MESSAGE);
END;

exec Proc01;

-- --------------------------------------
drop procedure Proc02;
create or replace PROCEDURE Proc02 
IS
    score number := 90;
    var1 varchar2(10);
    START_MESSAGE VARCHAR2(100) := '------test_START----------';
    END_MESSAGE VARCHAR2(100) := '-------test_END------------';
BEGIN
    DBMS_OUTPUT.PUT_LINE(START_MESSAGE);
    IF (score>=90) then
       var1 :='A';
    Elsif (score>=80) Then
       var1 :='B';
    Elsif (score>=70) Then
        var1 :='C';
    Elsif (score>=60) Then   
        var1 :='D';
    else
       var1 :='E';
    END IF;
    DBMS_OUTPUT.PUT_LINE(var1);
    DBMS_OUTPUT.PUT_LINE(END_MESSAGE);
END;

exec Proc02 ;


drop procedure Proc03;
create or replace PROCEDURE Proc03 
IS
    NUM1 NUMBER :=1;
BEGIN
    WHILE(NUM1<10) --NUM이 10보다 작을때까지 LOOP실행
    LOOP
    DBMS_OUTPUT.PUT_LINE(NUM1); --출력
    NUM1 := NUM1+1; --NUM = NUM +1
    END LOOP;

END;

exec Proc03;

create or replace procedure Proc04
(
    s IN number,
    e IN number
)
IS
    num1 number := s;
BEGIN
   
    WHILE(num1<=e) --NUM이 10보다 작을때까지 LOOP실행
    LOOP
    DBMS_OUTPUT.PUT_LINE(num1); --출력
    num1 := num1+1;  
    END LOOP;
END;

exec Proc04(5,10);
exec Proc04(7,20);

-- 외부로부터 구구단수를 입력받아 단수만큼의 구구단 출력
-- 프로시저명 : googoodan(dan IN number)

create or replace procedure googoodan
(
   dan IN number
)
IS
    i number := 1;
BEGIN
   
    WHILE(i<=9) --NUM이 10보다 작을때까지 LOOP실행
    LOOP
    DBMS_OUTPUT.PUT_LINE(dan || ' x ' || i || ' = ' || (dan*i) ); --출력
    i := i+1;  
    END LOOP;
END;
exec googoodan(5);

-- --------------------------------
drop procedure Proc07;
create or replace procedure Proc07
(
    s IN number,
    e IN number,
    r OUT number
)
IS
    i number :=s;
    s1 number :=0;
BEGIN   
    WHILE(i<=e) --NUM이 10보다 작을때까지 LOOP실행
    LOOP
        DBMS_OUTPUT.PUT_LINE(i); --출력
        s1:=s1 + i;
        i := i + 1;  
    END LOOP;
    
    r := s1;
    commit;
END;

declare
    r number;
begin
     proc07(1,10,r);
end;

-- 확인 
declare
    r number;
begin
    Proc07(1,10,r);
    DBMS_OUTPUT.PUT_LINE('결과 : ' || r);
end;
-- --------------------------------------------
create or replace procedure Proc05
(
    num in number,
    div in number
)
IS 
BEGIN
    
    DBMS_OUTPUT.PUT_LINE(num/div);
    EXCEPTION 
        WHEN ZERO_DIVIDE THEN 
            DBMS_OUTPUT.PUT_LINE('0으로 나눌 수 없습니다. 기본앖 0으로 치환 합니다.');
END;    

exec Proc05(10,4);
exec Proc05(10,0);

select * from usertbl;

create table backup_user as select * from usertbl where 1=2;
select * from backup_user;
alter table backup_user add type varchar(10) not null;
alter table backup_user add moddate date not null;
select * from backup_user;

create or replace trigger trg_01
after
update
on usertbl
for each row
begin
    insert into backup_user values(:old.userid,:old.name,:old.birthyear,
        :old.addr,:old.mobile1,:old.mobile2, :old.height, :old.mdate, '수정', SYSDATE);
end;

select * from usertbl;
update usertbl set addr='대구' where userid='LJB';
select * from backup_user;

create or replace trigger trg_02
after
delete
on usertbl
for each row
begin
    insert into backup_user values(:old.userid,:old.name,:old.birthyear,
        :old.addr,:old.mobile1,:old.mobile2, :old.height, :old.mdate, '삭제', SYSDATE);
end;


select * from usertbl;
delete from usertbl where userid='EJW';
select * from backup_user;


create or replace trigger trg_03
before
insert
on usertbl
for each row
begin
    insert into backup_user values(:new.userid,:new.name,:new.birthyear,
        :new.addr,:new.mobile1,:new.mobile2, :new.height, :new.mdate, '추가', SYSDATE);
end;

select * from usertbl;
insert into usertbl values('aaa','에이',1999,'대구','010','0111111',177,SYSDATE);
select * from backup_user;

-- on update cascad

drop table usertbl;
drop table buytbl;


-- --------------------------------------------
-- UserTbl 만들기
CREATE TABLE userTbl( -- 회원테이블
userID CHAR(8) NOT NULL PRIMARY KEY, -- 사용자아이디
name VARCHAR(10) NOT NULL, -- 이름
birthYear INT NOT NULL, -- 출생년도
addr NCHAR(2) NOT NULL, --지역(2글자만 입력, 경남,서울,경기..)
mobile1 CHAR(3), -- 휴대폰의 국번(011,016...)
mobile2 CHAR(8), -- 휴대폰의 나머지 전화번호
height SMALLINT, -- 키
mDate DATE --회원가입일
);

-- Buytbl 만들기
CREATE TABLE buyTbl( -- 회원 구매 테이블
num INT NOT NULL PRIMARY KEY, -- 순번(PK) 
userID CHAR(8) NOT NULL, --
prodName CHAR(15) NOT NULL, -- 물품명
groupName CHAR(15), -- 분류
price INT NOT NULL, -- 단가
amount SMALLINT NOT NULL, -- 수량
FOREIGN KEY (userID) REFERENCES userTbl(userID)
);

-- Usertbl 값삽입
INSERT INTO userTbl VALUES('LSG','이승기',1987,'서울','011','1111111',182,'2008-8-8');
INSERT INTO userTbl VALUES('KBS','김범수',1979,'경남','011','2222222',173,'2012-4-4');
INSERT INTO userTbl VALUES('KKH','김경호',1971,'전남','019','3333333',177,'2007-7-7');
INSERT INTO userTbl VALUES('JYP','조용필',1950,'경기','011','4444444',166,'2009-4-4');
INSERT INTO userTbl VALUES('SSK','성시경',1979,'서울',NULL,NULL,186,'2013-12-12');
INSERT INTO userTbl VALUES('LJB','임재범',1963,'서울','016','6666666',182,'2009-9-9');
INSERT INTO userTbl VALUES('YJS','윤종신',1969,'경남',NULL,NULL,170,'2005-5-5');
INSERT INTO userTbl VALUES('EJW','은지원',1972,'경북','011','8888888',174,'2014-3-3');
INSERT INTO userTbl VALUES('JKW','조관우',1965,'경기','018','9999999',172,'2010-10-10');
INSERT INTO userTbl VALUES('BBK','바비킴',1973,'서울','010','0000000',176,'2013-5-5');

select * from usertbl;

-- Buytbl 값 삽입

INSERT INTO buyTbl VALUES(1,'KBS','운동화',NULL,30,2);
INSERT INTO buyTbl VALUES(2,'KBS','노트북','전자',1000,1);
INSERT INTO buyTbl VALUES(3,'JYP','모니터','전자',200,1);
INSERT INTO buyTbl VALUES(4,'BBK','모니터','전자',200,5);
INSERT INTO buyTbl VALUES(5,'KBS','청바지','의류',50,3);
INSERT INTO buyTbl VALUES(6,'BBK','메모리','전자',80,10);
INSERT INTO buyTbl VALUES(7,'SSK','책','서적',15,5);
INSERT INTO buyTbl VALUES(8,'EJW','책','서적',15,2);
INSERT INTO buyTbl VALUES(9,'EJW','청바지','의류',50,1);
INSERT INTO buyTbl VALUES(10,'BBK','운동화',NULL,30,2);
INSERT INTO buyTbl VALUES(11,'EJW','책','서적',15,1);
INSERT INTO buyTbl VALUES(12,'BBK','운동화',NULL,30,2);



select * from usertbl;
select * from buytbl;
delete from usertbl where userid='KBS';


create or replace trigger on_Update_trg
after
update or delete
on usertbl
for each row
begin
    update buytbl set userid=:new.userid where userid=:old.userid;
end;

select * from usertbl;
select * from buytbl;
update usertbl set userid='AAA' where userid='KBS';



-- 트리거

-- 정리

-- OracleDB + JDBC 연결하기

-- SQLD 시험대비 or 프론트엔드 공부!!

