select * from buytbl where groupname is not null;
select * from buytbl where groupname<>'null';
select * from buytbl where groupname!='null';

select prodname,sum(amount) from buytbl group by rollup(prodname);
select num,prodname,sum(amount) from buytbl group by rollup(prodname,num);
-- ---------------------------
drop table tmp_tbl;
create table tmp_tbl
(
    id int,
    username char(10),
    age int 
);
create sequence tmp_seq 
start with 1
increment by 1
maxvalue 100
cycle nocache;

insert into tmp_tbl values(tmp_seq.NEXTVAL,'aaa',11);
insert into tmp_tbl values(tmp_seq.NEXTVAL,'aab',11);
insert into tmp_tbl values(tmp_seq.NEXTVAL,'aac',11);
insert into tmp_tbl values(tmp_seq.NEXTVAL,'aad',11);

select * from tmp_tbl;

select tmp_seq.CURRVAL from dual;
-- --------------------------------------------

create table test_01(
userid char(10) primary key,
name char(10) not null
);
create table test_02(
userid char(10),
name char(10) not null,
primary key(userid)
);
-- C : NOT NULL, P : Primary key
select * from ALL_CONSTRAINTS where TABLE_NAME='TEST_01';
select * from ALL_CONS_COLUMNS where TABLE_NAME='TEST_01';

alter table test_01 drop primary key;
select * from ALL_CONSTRAINTS where TABLE_NAME='TEST_01';

alter table test_01 add constraint PK_Tbl_01 primary key(userid);
select * from ALL_CONSTRAINTS where TABLE_NAME='TEST_01';

create table test_03(
userid char(10),
name char(10) not null,
primary key(name,userid)
);
drop table test_03;
select * from ALL_CONSTRAINTS where TABLE_NAME='TEST_03';
select * from ALL_CONS_COLUMNS where TABLE_NAME='TEST_03';

create table test_04(
userid char(10),
name char(10) not null
);

alter table test_04 add constraint PK_TEST_04 primary key(userid,name);
select * from ALL_CONSTRAINTS where TABLE_NAME='TEST_04';
select * from ALL_CONS_COLUMNS where TABLE_NAME='TEST_04';

-- -------------------------------------------
create table tbl_prod
(
    prod_id int primary key,
    prod_name varchar(40)
);
create table tbl_order(
 order_id int primary key,
 prod_id int,
 order_date date,
 constraint FK_ORDER_PROD foreign key(prod_id) references tbl_prod(prod_id)
);
-- C : check,not null , P : primary key , R : foreign key , U : unique
select * from ALL_CONSTRAINTS where TABLE_NAME='TBL_ORDER';
select * from ALL_CONS_COLUMNS where TABLE_NAME='TBL_ORDER';

alter table tbl_order drop constraint FK_ORDER_PROD;
select * from ALL_CONSTRAINTS where TABLE_NAME='TBL_ORDER';

alter table tbl_order add constraint FK_O_P foreign key(prod_id) references tbl_prod(prod_id)
on delete cascade; -- 오라클에서는 on update cascade 지원하지 않는다. 트리거 설정을 통해 동일한 기능 구현

select * from ALL_CONSTRAINTS where TABLE_NAME='TBL_ORDER';


select * from buytbl;
select * from usertbl;


create table a_tbl
(
    col1 int,
    col2 int,
    primary key(col1,col2)
)

select * from ALL_CONSTRAINTS where TABLE_NAME='A_TBL';
select * from ALL_CONS_COLUMNS where TABLE_NAME='A_TBL';


create table producttbl
(
    code int primary key,
    prodname varchar(25) not null,
    price int,
    count int
)
create table customertbl
(
    num int primary key, 
    userid varchar2(50) not null,
    name varchar2(10) not null,
    grade varchar2(5) not null,
    phone varchar2(15),
    code int, 
    amount int not null
)
alter table customertbl add constraint FK_C_P foreign key(code) references producttbl(code)
on delete cascade;


create table tbl_bookstore
(
    book_code int primary key,
    book_name varchar(20),
    publisher varchar(20)
);  
desc tbl_bookstore;
create table tbl_customer(
    id varchar(25) primary key,
    name varchar(20) not null,
    addr varchar(100)
);
desc tbl_customer;
drop table tbl_order;
create table tbl_order(
    order_id int primary key,
    book_code int,
    id varchar(25),
    order_date date
);
alter table tbl_order add constraint FK_ORDER_BOOKSTORE foreign key(book_code) 
references tbl_bookstore(book_code) on delete cascade;

alter table tbl_order add constraint FK_ORDER_CUSTOMER foreign key(id) 
references tbl_customer(id) on delete cascade;


select * from ALL_CONSTRAINTS where TABLE_NAME='TBL_ORDER';
select * from ALL_CONS_COLUMNS where TABLE_NAME='TBL_ORDER';

select A.CONSTRAINT_NAME,A.TABLE_NAME,A.CONSTRAINT_TYPE,B.COLUMN_NAME
from ALL_CONSTRAINTS A, ALL_CONS_COLUMNS B
where A.CONSTRAINT_NAME=B.CONSTRAINT_NAME and A.TABLE_NAME='TBL_ORDER'

-- -------------------------------------------
create table test_05
(
    userid char(8) primary key,
    name varchar(10) not null,
    email char(30) unique
);
select * from ALL_CONSTRAINTS where TABLE_NAME='TEST_05';
select * from ALL_CONS_COLUMNS where TABLE_NAME='TEST_05';




select A.CONSTRAINT_NAME,A.TABLE_NAME,A.CONSTRAINT_TYPE,B.COLUMN_NAME
from ALL_CONSTRAINTS A, ALL_CONS_COLUMNS B
where A.CONSTRAINT_NAME=B.CONSTRAINT_NAME and A.TABLE_NAME='TEST_05'

create table test_06
(
    userid char(8) primary key,
    name varchar(10) not null,
    email char(30),
    constraint UK_EMAIL unique(email)
);
insert into test_06 values('aaa','홍길동1','example@example');
insert into test_06 values('bbb','홍길동2','example@example'); -- 중복 허용x
insert into test_06(userid,name) values('ccc','홍길동3'); -- 빈값 허용
select * from test_06;

select A.CONSTRAINT_NAME,A.TABLE_NAME,A.CONSTRAINT_TYPE,B.COLUMN_NAME
from ALL_CONSTRAINTS A, ALL_CONS_COLUMNS B
where A.CONSTRAINT_NAME=B.CONSTRAINT_NAME and A.TABLE_NAME='TEST_06'


select * from usertbl;

drop table TEST_07;
create table TEST_07
(
    userid char(8) primary key,
    name varchar(10),
    email char(30) unique,
    birthyear int check(birthyear >=1900 and birthyear <=2025),
    phone char(20) unique,
    constraint CK_name check(name is not null)
);
insert into TEST_07(userid,name,birthyear) values('a','홍길동1',1901);
insert into TEST_07(userid,name,birthyear) values('b','홍길동2',1800);
insert into TEST_07(userid,birthyear) values('c',2000);


select * from ALL_CONSTRAINTS;
select * from ALL_CONS_COLUMNS;


select A.CONSTRAINT_NAME,A.TABLE_NAME,A.CONSTRAINT_TYPE,B.COLUMN_NAME
from ALL_CONSTRAINTS A, ALL_CONS_COLUMNS B;
where A.CONSTRAINT_NAME=B.CONSTRAINT_NAME and A.TABLE_NAME='TEST_07'

select * from buytbl;

create table tbl_user as select * from usertbl;
create table tbl_buy as select * from buytbl;
select * from tbl_user
select * from tbl_buy;
select * from ALL_CONSTRAINTS where TABLE_NAME='TBL_USER';
select * from ALL_CONSTRAINTS where TABLE_NAME='TBL_BUY';
-- 문제
-- tbl_user의 userid 열을 primary key 설정합니다.
-- tbl_buy의 userid 열을 tbl_user의 userid을 기본키로 하는 외래키 설정 하세요
-- tbl_buy의 amount 를 1-1000 개 사이로 제한합니다 check 제약 조건
-- tbl_user 의 birthyear 를 1950 - 2000 으로 제한합니다 check 제약조건 
alter table tbl_user add constraint PK_Userid  primary key(userid);
select * from ALL_CONSTRAINTS where TABLE_NAME='TBL_USER';
alter table tbl_buy add constraint FK_BUY_USER1 foreign key(userid) references tbl_user(userid)
on delete cascade;
select * from ALL_CONSTRAINTS where TABLE_NAME='TBL_BUY';
alter table tbl_buy add constraint CK_AMOUNT check (amount>=1 and amount<=1000);
select * from ALL_CONSTRAINTS where TABLE_NAME='TBL_BUY';
alter table tbl_user add constraint CK_BIRTHYEAR check (birthyear between 1950 and 2000);
select * from ALL_CONSTRAINTS where TABLE_NAME='TBL_USER';

alter table tbl_user drop constraint CK_BIRTHYEAR;
alter table tbl_buy drop constraint FK_BUY_USER1;
alter table tbl_user drop primary key;
 
commit;

create table tbl_a(
 id int primary key
);
create table tbl_b(
 id int,
 constraint FK_A_B foreign key(id) references tbl_a(id)
);
create table tbl_c(
 id int,
 constraint FK_A_C foreign key(id) references tbl_a(id)
);

drop table tbl_c;
drop table tbl_a;
drop table tbl_a cascade constraints;


desc test_01;
select * from test_01;
alter table test_01 modify(name default '없음');
insert into test_01 values('aaa',default);
insert into test_01 values('bbb',default);
insert into test_01 values('ccc',default);
select * from test_01;
select column_name,data_default from USER_TAB_COLUMNS where TABLE_NAME='TEST_01';


















