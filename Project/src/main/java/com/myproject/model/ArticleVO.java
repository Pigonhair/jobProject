package com.myproject.model;

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
	private String a_youtubeid;
	private String a_img;
	private String a_delte_yn;
	private String job_yn;

	public int getA_num() {
		return a_num;
	}

	public void setA_num(int a_num) {
		this.a_num = a_num;
	}

	public String getA_id() {
		return a_id;
	}

	public void setA_id(String a_id) {
		this.a_id = a_id;
	}
	
	public String getA_writer() {
		return a_writer;
	}

	public void setA_writer(String a_writer) {
		this.a_writer = a_writer;
	}

	public String getA_title() {
		return a_title;
	}

	public void setA_title(String a_title) {
		this.a_title = a_title;
	}

	public String getA_content() {
		return a_content;
	}

	public void setA_content(String a_content) {
		this.a_content = a_content;
	}
	
	public String getA_youtubeid() {
		return a_youtubeid;
	}

	public void setA_youtubeid(String a_youtubeid) {
		this.a_youtubeid = a_youtubeid;
	}

	public String getA_img() {
		return a_img;
	}

	public void setA_img(String a_img) {
		this.a_img = a_img;
	}

	public String getA_delte_yn() {
		return a_delte_yn;
	}

	public void setA_delte_yn(String a_delte_yn) {
		this.a_delte_yn = a_delte_yn;
	}

	public String getJob_yn() {
		return job_yn;
	}

	public void setJob_yn(String job_yn) {
		this.job_yn = job_yn;
	}

}

