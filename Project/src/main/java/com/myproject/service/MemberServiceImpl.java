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

	// ȸ������
	@Override
	public int insertMember(MemberVO vo) {
		System.out.println("**********Impl ����******");
		int n=0;
		// ������ mem_num �����ϰ�
		vo.setM_num(mapper.selectMem_num());
		System.out.println("vo���� ������ m_num�� ���� : " + vo.getM_num());
		log.info("MemberVO : " + vo);
		n = mapper.insertMember(vo);
		return n;
		

	}

	// �α���
	@Override
	public MemberVO checkMemberIdPwd(String m_id, String m_pwd) {
		MemberVO vo = mapper.checkMemberIdPwd(m_id, m_pwd);
		return vo;
	}

	// ID�ߺ�üũ
	@Override
	public MemberVO IdCheck(String m_id) {
		MemberVO vo = mapper.IdCheck(m_id);
		return vo;
	}

}
