package com.myproject.mapper;

import com.myproject.model.MemberVO;

public interface MemberMapper {
	
	/* Mem_num 1씩 자동 증가하는 시퀀스 값 가져오기 */
	public int selectMem_num();
	
	/* 멤버 등록 */
	public void insertMember(MemberVO vo);

	/* 로그인하기 */
	public MemberVO checkMemberIdPwd(MemberVO vo);

	

}
