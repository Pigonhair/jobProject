package com.myproject.mapper;


import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.myproject.model.MemberVO;

public interface MemberMapper {
	
	/* Mem_num 1씩 자동 증가하는 시퀀스 값 가져오기 */
	public int selectMem_num();
	
	/* 멤버 등록 */
	public int insertMember(MemberVO vo);

	/* 로그인하기 */
	public MemberVO checkMemberIdPwd(@Param("m_id") String m_id, @Param("m_pwd") String m_pwd);
	
	/* ID중복체크하기 */
	public MemberVO IdCheck(String m_id);
	
	/* Salt체크하기 */
	public MemberVO SaltCheck(String m_id);

	/* 사용자 리스트 */
	public List<HashMap<String, MemberVO>> UserList();

	

}
