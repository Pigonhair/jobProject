package com.myproject.service;

import com.myproject.model.MemberVO;

public interface MemberService {

	/* ��� ��� */
	public void insertMember(MemberVO vo);
	
	/* �α��� �ϱ� */
	public MemberVO checkMemberIdPwd(MemberVO vo);
}
