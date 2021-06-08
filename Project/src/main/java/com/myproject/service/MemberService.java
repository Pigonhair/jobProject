package com.myproject.service;

import com.myproject.model.MemberVO;

public interface MemberService {

	/* 멤버 등록 */
	public void insertMember(MemberVO vo);
	
	/* 로그인 하기 */
	public MemberVO checkMemberIdPwd(MemberVO vo);
}
