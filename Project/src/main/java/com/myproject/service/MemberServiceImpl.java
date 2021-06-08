package com.myproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.mapper.MemberMapper;
import com.myproject.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mapper;

	// ȸ������
	@Override
	public void insertMember(MemberVO vo) {
		System.out.println("**********Impl ����******");
		// ������ mem_num �����ϰ�
		vo.setM_num(mapper.selectMem_num());
		System.out.println("vo���� ������ m_num�� ���� : " + vo.getM_num());

		mapper.insertMember(vo);

	}

	// �α���
	@Override
	public MemberVO checkMemberIdPwd(MemberVO vo) {
		MemberVO memberVO = mapper.checkMemberIdPwd(vo);
		return memberVO;
	}

}
