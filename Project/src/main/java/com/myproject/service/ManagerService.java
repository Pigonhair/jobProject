package com.myproject.service;


public interface ManagerService {

	/* ��� �������� */
	public int RemoveMember(String m_id);
	
	/* ��� ���� */
	public int DeleteMember(String m_id);
	
	/* ��� ���� */
	public int RestoreMember(String m_id);
	
}
