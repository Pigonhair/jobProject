package com.myproject.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.controller.MemberController;
import com.myproject.mapper.MemberMapper;
import com.myproject.model.MemberVO;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberMapper mapper;

	// ȸ������
	@Override
	public int insertMember(MemberVO vo) {
		System.out.println("**********Impl ����******");
		int n=0;
		// ������ mem_num �����ϰ�
		vo.setM_num(mapper.selectMem_num());
		System.out.println("vo���� ������ m_num�� ���� 1: " + vo.getM_num());
		log.info("MemberVO : " + vo);
		System.out.println(vo);
		n = mapper.insertMember(vo);
		return n;
		

	}

	// �α���
	@Override
	public MemberVO checkMemberIdPwd(MemberVO vo) {
		MemberVO memberVO = mapper.checkMemberIdPwd(vo);
		return memberVO;
	}

}
