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

create table tbl_lend
(
	lid int primary key,
	bookcode int not null,
	memId varchar(45) not null,
	startDate date,
	endDate date
);
desc tbl_lend;
select * from tbl_lend;
select * from tbl_book;

delete from tbl_member;

insert into tbl_member values('mem1', '1111',1);
insert into tbl_member values('mgr1', '1111',2);

select * from tbl_member;
select * from tbl_book;
select * from tbl_lend;