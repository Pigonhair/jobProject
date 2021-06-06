CREATE TABLE MEMBER (
m_num number not null,
m_id varchar2(100) unique not null,
m_pwd varchar2(100) not null, 
m_name varchar2(100), 
m_address varchar2(100),
m_phone varchar2(100),
cache varchar2(100),
token varchar2(100),
pi_yn varchar2(20) DEFAULT 'N',
m_department varchar2(100),
m_grade varchar2(100),
my_img varchar2(100)
);

select * from MEMBER;
drop table MEMBER;

create sequence mem_num nocache nocycle;
drop sequence mem_num;

INSERT INTO MEMBER (m_num, m_id,m_pwd, m_name, m_address, m_phone, cache, token, m_department, m_grade, my_img) 
VALUES (mem_num.nextval, 'admin', '1234', '관리자', '서초구 반포대로', '010-1234-5678', '', '', '관리자', '5', '');