package com.myproject.service;


import com.myproject.model.MemberVO;

public interface MemberService {

	/* 멤버 등록 */
	public int insertMember(MemberVO vo);
	
	/* 로그인 하기 */
	public MemberVO checkMemberIdPwd(String m_id,  String m_pwd);
	
	/* 아이디 중복체크 */
	public MemberVO IdCheck(String m_id);
}
