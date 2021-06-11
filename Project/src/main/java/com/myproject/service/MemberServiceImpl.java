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

	// 회원가입
	@Override
	public int insertMember(MemberVO vo) {
		System.out.println("**********Impl 들어옴******");
		int n=0;
		// 시퀀스 mem_num 적용하고
		vo.setM_num(mapper.selectMem_num());
		System.out.println("vo에서 가져온 m_num의 값은 1: " + vo.getM_num());
		log.info("MemberVO : " + vo);
		System.out.println(vo);
		n = mapper.insertMember(vo);
		return n;
		

	}

	// 로그인
	@Override
	public MemberVO checkMemberIdPwd(MemberVO vo) {
		MemberVO memberVO = mapper.checkMemberIdPwd(vo);
		return memberVO;
	}

}
