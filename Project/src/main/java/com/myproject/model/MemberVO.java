package com.myproject.model;

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
	
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pwd() {
		return m_pwd;
	}
	public void setM_pwd(String m_pwd) {
		this.m_pwd = m_pwd;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_address() {
		return m_address;
	}
	public void setM_address(String m_address) {
		this.m_address = m_address;
	}
	public String getM_phone() {
		return m_phone;
	}
	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	public String getM_department() {
		return m_department;
	}
	public void setM_department(String m_department) {
		this.m_department = m_department;
	}
	public String getM_grade() {
		return m_grade;
	}
	public void setM_grade(String m_grade) {
		this.m_grade = m_grade;
	}
	public String getM_img() {
		return m_img;
	}
	public void setM_img(String m_img) {
		this.m_img = m_img;
	}
	public String getCache() {
		return cache;
	}
	public void setCache(String cache) {
		this.cache = cache;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	@Override
	public String toString() {
		return "MemberVO [m_num=" + m_num + ", m_id=" + m_id + ", m_pwd=" + m_pwd + ", m_name=" + m_name
				+ ", m_address=" + m_address + ", m_phone=" + m_phone + ", m_department=" + m_department + ", m_grade="
				+ m_grade + ", m_img=" + m_img + ", cache=" + cache + ", token=" + token + " ]";
	}
	
	
}
