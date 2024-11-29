create table hakjum(
 LOWSCORE     NUMBER(3),
 HISCORE      NUMBER(5,2),
 GRADE        VARCHAR2(3) primary key
 );
 
  
 insert into hakjum (LOWSCORE, HISCORE, GRADE) values ( 0,59.99,'F');
 insert into hakjum (LOWSCORE, HISCORE, GRADE) values ( 60,64.99,'D0');
 insert into hakjum (LOWSCORE, HISCORE, GRADE) values ( 65,69.99,'D+');
 insert into hakjum (LOWSCORE, HISCORE, GRADE) values ( 70,74.99,'C0');
 insert into hakjum (LOWSCORE, HISCORE, GRADE) values ( 75,79.99,'C+');
 insert into hakjum (LOWSCORE, HISCORE, GRADE) values ( 80,84.99,'B0');
 insert into hakjum (LOWSCORE, HISCORE, GRADE) values ( 85,89.99,'B+');
 insert into hakjum (LOWSCORE, HISCORE, GRADE) values ( 90,94.99,'A0');
 insert into hakjum (LOWSCORE, HISCORE, GRADE) values ( 95,100,'A+');
 

 
 select*from hakjum;
 
 drop table student purge;
 
 create table student(
  NO NUMBER primary key,
 NAME VARCHAR2(21) not null,
 KOR NUMBER(3) not null check(kor between 0 and 100),
 MATH NUMBER(3) not null check(math between 0 and 100),
 ENG NUMBER(3) not null check(eng between 0 and 100),
 TOT NUMBER(3),
 AVG NUMBER(5,2),
 GRADE VARCHAR2(3) references hakjum(grade));
 
 create sequence student_seq
 	INCREMENT BY 1
    START WITH 1;
    
    
    select grade
    from hakjum
    where 100 between lowscore and hiscore;
    
    insert into student
    values(1, '홍길동', 100,100,100,300,100,
    (select grade from hakjum where 100 between lowscore and hiscore));
    
    insert into student
    values(시퀀스, ? , ?,?,?,?,?,
    (select grade from hakjum where ? between lowscore and hiscore));
    