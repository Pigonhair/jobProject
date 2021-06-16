CREATE TABLE PROFILE (
p_num number not null,
p_id varchar(100) unique not null,
p_name varchar(100), 
p_phone varchar(100),
p_department varchar(100),
p_img varchar(100)
);

SELECT * FROM PROFILE;
drop table PROFILE
drop sequence profile_num 

create sequence profile_num nocache nocycle;

INSERT INTO PROFILE (p_num, p_id, p_name, p_phone, p_department, p_img) 
VALUES (profile_num.nextval, 'ab', '거누', '010-1234-5678', 'developer','kim');

INSERT INTO PROFILE (p_num, p_id, p_name, p_phone, p_department, p_img) 
VALUES (profile_num.nextval, 'abc', '지성', '010-1234-6789', 'developer','park');