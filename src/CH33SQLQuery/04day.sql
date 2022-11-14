drop table test_01;
drop table test_02;
create table test_01
(
    col1 int primary key,
    col2 int
);
select * from USER_INDEXES where TABLE_NAME='TEST_01';
create table test_02
(
    col1 int primary key,
    col2 int unique
);
select * from USER_INDEXES where TABLE_NAME='TEST_02';
drop table test_03;
create table test_03
(
    col1 int primary key,
    col2 int unique,
    col3 int,
    col4 int,
    constraint FK_03_01 foreign key(col3) references test_01(col1)
);
select * from USER_INDEXES where TABLE_NAME='TEST_03';

-- 직접 IDX 설정
create index IDX_COL2 on test_03(col2);
create index IDX_COL34 on test_03(col3,col4);
select * from USER_INDEXES where TABLE_NAME='TEST_03';

drop index IDX_COL34;
drop index SYS_C007094; -- PK index 삭제 불가
drop index SYS_C007097; -- PK index 삭제 불가
alter table test_03 drop primary key;
alter table test_03 drop constraint SYS_C007097;







