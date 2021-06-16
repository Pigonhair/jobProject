package com.myproject.service;


public interface ManagerService {

	/* ¸â¹ö ¿µ±¸»èÁ¦ */
	public int RemoveMember(String m_id);
	
	/* ¸â¹ö »èÁ¦ */
	public int DeleteMember(String m_id);
	
	/* ¸â¹ö º¹±¸ */
	public int RestoreMember(String m_id);
	
}
