package com.myproject.mapper;


import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.myproject.model.MemberVO;

public interface MemberMapper {
	
	/* Mem_num 1�� �ڵ� �����ϴ� ������ �� �������� */
	public int selectMem_num();
	
	/* ��� ��� */
	public int insertMember(MemberVO vo);

	/* �α����ϱ� */
	public MemberVO checkMemberIdPwd(@Param("m_id") String m_id, @Param("m_pwd") String m_pwd);
	
	/* ID�ߺ�üũ�ϱ� */
	public MemberVO IdCheck(String m_id);
	
	/* Saltüũ�ϱ� */
	public MemberVO SaltCheck(String m_id);

	/* ����� ����Ʈ */
	public List<HashMap<String, MemberVO>> UserList();

	

}
