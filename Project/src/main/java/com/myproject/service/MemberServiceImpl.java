package com.myproject.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.myproject.mapper.MemberMapper;
import com.myproject.model.MemberVO;
import com.myproject.util.SHA256Util;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	private MemberMapper mapper;

	// 회원가입
	@Override
	public int insertMember(MemberVO vo) {
		/*
		 * int n=0; vo.setM_num(mapper.selectMem_num()); log.info("MemberVO : " + vo); n
		 * = mapper.insertMember(vo);
		 */
		int n=0;
		String salt = SHA256Util.generateSalt();
		vo.setSalt(salt);
		
		String password = vo.getM_pwd();
		password = SHA256Util.getEncrypt(password, salt);
		
		vo.setM_pwd(password);
		vo.setM_num(mapper.selectMem_num());
		log.info("MemberVO : " + vo);
		n = mapper.insertMember(vo);
		return n;
		

	}

	// 로그인
	@Override
	public MemberVO checkMemberIdPwd(String m_id, String m_pwd) {
		MemberVO vo = mapper.SaltCheck(m_id);
		
		String password = m_pwd;
		password = SHA256Util.getEncrypt(password, vo.getSalt());
		
		vo = mapper.checkMemberIdPwd(m_id, password);
		
		return vo;
	}

	// ID중복체크
	@Override
	public MemberVO IdCheck(String m_id) {
		MemberVO vo = mapper.IdCheck(m_id);
		return vo;
	}

	//사용자 리스트
	@Override
	public List<HashMap<String, MemberVO>> UserList() {
		List<HashMap<String , MemberVO>> vo = (List<HashMap<String, MemberVO>>) mapper.UserList();
		
		return vo;
	}

}
