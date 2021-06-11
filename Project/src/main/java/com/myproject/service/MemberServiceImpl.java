package com.myproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
		System.out.println("vo에서 가져온 m_num의 값은 : " + vo.getM_num());
		log.info("MemberVO : " + vo);
		n = mapper.insertMember(vo);
		return n;
		

	}

	// 로그인
	@Override
	public MemberVO checkMemberIdPwd(String m_id, String m_pwd) {
		MemberVO vo = mapper.checkMemberIdPwd(m_id, m_pwd);
		return vo;
	}

	// ID중복체크
	@Override
	public MemberVO IdCheck(String m_id) {
		MemberVO vo = mapper.IdCheck(m_id);
		return vo;
	}

}
