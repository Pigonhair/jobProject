package com.myproject.model;

import lombok.Data;

@Data
public class ArticleVO {
	/*
	 * a_num number not null, a_id varchar(100) default 'N', a_writer varchar(100)
	 * unique not null, a_title varchar(100) not null, a_content varchar(200) not
	 * null, a_img varchar(200) default 'no_img', a_youtubeid varchar(100),
	 * a_createDay DATE default SYSDATE, a_updateDay DATE default SYSDATE,
	 * a_delete_yn varchar(20) default 'N' , job_yn varchar(20) default 'N'
	 */

	private int a_num;
	private String a_id;
	private String a_writer;
	private String a_title;
	private String a_content;
	private String a_videocode;


	
}

