select * from member;

CREATE TABLE MEMBER (
m_num number not null,
m_id varchar(100) unique not null,
m_pwd varchar(100) not null, 
m_name varchar(100), 
m_address varchar(100),
m_phone varchar(100),
m_department varchar(100),
m_grade varchar(100),
m_img varchar(100),
cache varchar(100),
token varchar(100),
pi_yn varchar(20) DEFAULT 'N',
constraint pk_num PRIMARY key(m_num)
);

drop table member
drop sequence mem_num 

create sequence mem_num nocache nocycle;

INSERT INTO MEMBER (m_num, m_id,m_pwd, m_name, m_address, m_phone, m_department, m_grade, m_img, cache, token) 
VALUES (mem_num.nextval, 'ab', '1234', '관리자', '서초구 반포대로', '','관리자','5',' ',' ',' ');

    
