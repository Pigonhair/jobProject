package com.myproject.mapper;

import com.myproject.model.MemberVO;

public interface MemberMapper {
	
	/* Mem_num 1�� �ڵ� �����ϴ� ������ �� �������� */
	public int selectMem_num();
	
	/* ��� ��� */
	public void insertMember(MemberVO vo);

	/* �α����ϱ� */
	public MemberVO checkMemberIdPwd(MemberVO vo);

	

}
