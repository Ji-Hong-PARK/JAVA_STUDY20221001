select * from tbl_book;
desc tbl_book;

create table tbl_member
(
	memId varchar(20) primary key,
	pwd varchar(255) not null
);

select * from tbl_member;
select * from tbl_book;
desc tbl_member;

--------------------------
desc tbl_member;
--role값을 하나더 넣어주자.

delete from tbl_member;
insert into tbl_member values('mem1', 1111, 0);
insert into tbl_member values('mgr1', 1111, 1);
select * from tbl_member;