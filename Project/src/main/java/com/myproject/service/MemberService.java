package com.myproject.service;


import java.util.HashMap;
import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.myproject.model.MemberVO;

public interface MemberService {

	/* 멤버 등록 */
	public int insertMember(MemberVO vo);
	
	/* 로그인 하기 */
	public MemberVO checkMemberIdPwd(String m_id,  String m_pwd);
	
	/* 아이디 중복체크 */
	public MemberVO IdCheck(String m_id);
	
	/* 사용자 리스트 */
	public List<HashMap<String, MemberVO>> UserList();
}
