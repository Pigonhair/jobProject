package com.myproject.service;


import com.myproject.model.MemberVO;

public interface MemberService {

	/* ��� ��� */
	public int insertMember(MemberVO vo);
	
	/* �α��� �ϱ� */
	public MemberVO checkMemberIdPwd(String m_id,  String m_pwd);
	
	/* ���̵� �ߺ�üũ */
	public MemberVO IdCheck(String m_id);
}
