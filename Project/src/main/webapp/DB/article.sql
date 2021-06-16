CREATE TABLE article(
a_num number not null,
a_id varchar(100) not null,
a_writer varchar(100) unique not null,
a_title  varchar(100) not null,
a_content varchar(200) not null,
a_img varchar(200) default 'no_img',
a_youtubeid varchar(100),
a_createDay DATE default SYSDATE,
a_updateDay DATE default SYSDATE,
a_delete_yn varchar(20) default 'N' ,
job_yn varchar(20) default 'N'
);

SELECT * FROM ARTICLE
WHERE a_id ='abc'

	
create sequence article_num nocache nocycle;

drop table article
drop sequence article_num 

SELECT * FROM article;

INSERT INTO article (a_num, a_id, a_writer ,a_title, a_content, a_youtubeid) 
VALUES (article_num.nextval, 'ab','�Ŵ�', '�Ǹ۳�������Ʈ', '�ְߺо�~', 'pigonhairtt@gmail.com');

INSERT INTO article (a_num, a_id, a_writer ,a_title, a_content, a_youtubeid) 
VALUES (article_num.nextval, 'abc','����', '�ν�Ÿ������Ʈ', '�ν�����~', 'park@gmail.com');