drop table test purge;
create table test(
	no number(10),
	name varchar2(20)
);
	
	delete from test;
	
drop table board purge;	
select * from board;	
	
drop sequence board_seq;
create sequence board_seq;

create table board(
BOARD_NUM NUMBER(5) NOT NULL ,
BOARD_NAME VARCHAR2(30),
BOARD_PASS VARCHAR2(30),
BOARD_SUBJECT VARCHAR2(30),
BOARD_CONTENT VARCHAR2(30),
BOARD_FILE VARCHAR2(30),
BOARD_ORIGINAL VARCHAR2(50),
BOARD_RE_REF NUMBER(5),
BOARD_RE_LEV NUMBER(5),
BOARD_RE_SEQ NUMBER(5),
BOARD_READCOUNT NUMBER(5),
BOARD_DATE DATE
);

select min(board_re_seq ) -1
from board
where board_re_ref=?
and board_re_lev=?
and board_re_seq>?;

select min(board_re_seq ) -1
from board
where board_re_ref=1
and board_re_lev=1
and board_re_seq>2;

delete from board
where board_re_ref = ?
and   board_re_lev >=?
and	  board_re_seq >=?
and   board_re_seq <=

delete from board
where board_re_ref = ?
and   board_re_lev >=?
and	  board_re_seq >=?
and   board_re_seq <= (select min(board_re_seq ) -1
						from board
						where board_re_ref=?
						and board_re_lev=?
						and board_re_seq>?;
						
select board_num
from  board
where board_re_ref = 1
and   board_re_lev >=1
and	  board_re_seq >=2
and   board_re_seq <= (select min(board_re_seq ) -1
						from  board
						where board_re_ref=1
						and   board_re_lev=1
						and   board_re_seq>2);

select * from board;
						
select max(board_re_seq)
from BOARD
where board_re_ref=?


select max(board_re_seq)
from BOARD
where board_re_ref=1;

select board_num
from board
where board_re_ref = 1
and   board_re_lev >=0
and	  board_re_seq >=0
and   board_re_seq <= (select max(board_re_seq)
					 from BOARD
					 where board_re_ref=1);
					 
delete from board
where board_re_ref = ?
and board_re_lev >=?
and board_re_seq >=?
and board_re_seq <=(   nvl(     ,     )
					);

					
delete from board
where board_re_ref = ?
and board_re_lev >=?
and board_re_seq >=?
and board_re_seq <=( nvl((select min(board_re_seq)-1
						from board
						where board_re_ref=?
						and board_re_lev=?
						and board_re_seq>?) ,
						(select max(board_re_seq)
						from BOARD
						where board_re_ref=?))
						);
					
select board_num
from board
where board_re_ref = 1
and board_re_lev >=1
and board_re_seq >=2
and board_re_seq <=( nvl((select min(board_re_seq)-1
						from board
						where board_re_ref=1
						and board_re_lev=1
						and board_re_seq>2) ,
						(select max(board_re_seq)
						from BOARD
						where board_re_ref=1))
						);						

create table board_backup
as
select * from board;


insert into board select * from board_backup;
commit;