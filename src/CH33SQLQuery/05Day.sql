commit;
-- 실습용 테이블 생성
CREATE TABLE TEST(
NO NUMBER(3),
NAME VARCHAR2(10),
AGE NUMBER(3),
GENDER VARCHAR2(6)
);
-- 데이터 추가
INSERT INTO TEST VALUES(1, 'JOKER', '28', 'M');
-- 데이터 추가
INSERT INTO TEST VALUES(2, 'ADAMS', '33', 'M');
select * from test;
--세이브포인트 S1 지정
savepoint s1;
-- 데이터 추가
INSERT INTO TEST VALUES(3, 'SMITH', '35', 'M');
--세이브포인트 S2 지정
savepoint s2;
commit;
INSERT INTO TEST VALUES(4, 'MARRY', '40', 'W');
INSERT INTO TEST VALUES(5, 'KIM', '45', 'M');
select * from test;

rollback to s2;
select * from test;
rollback to s1;
select * from test;
rollback;
select * from test;



