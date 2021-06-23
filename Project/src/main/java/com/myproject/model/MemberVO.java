package com.myproject.model;

import lombok.Data;

@Data
public class MemberVO {
	/*
			m_num int not null,
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
			*/
	
	private int m_num;
	private String m_id;
	private String m_pwd;
	private String m_name;
	private String m_address;
	private String m_phone;
	private String m_department;
	private String m_grade;
	private String m_img;
	private String cache;
	private String token;
	private String salt;
		
}
