package com.myproject.service;

import java.util.List;

public interface ManagerService {

	/* 멤버 영구삭제 */
	public int RemoveMember(String m_id);
	
	/* 멤버 삭제 */
	public int DeleteMember(String m_id);
	
	/* 멤버등급 변경 */
	public List RestoreMember(List list);
	
}
