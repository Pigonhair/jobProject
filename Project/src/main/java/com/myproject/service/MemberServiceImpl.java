package com.myproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.mapper.MemberMapper;
import com.myproject.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper mapper;

	// 회원가입
	@Override
	public void insertMember(MemberVO vo) {
		System.out.println("**********Impl 들어옴******");
		// 시퀀스 mem_num 적용하고
		vo.setM_num(mapper.selectMem_num());
		System.out.println("vo에서 가져온 m_num의 값은 : " + vo.getM_num());

		mapper.insertMember(vo);

	}

	// 로그인
	@Override
	public MemberVO checkMemberIdPwd(MemberVO vo) {
		MemberVO memberVO = mapper.checkMemberIdPwd(vo);
		return memberVO;
	}

}
