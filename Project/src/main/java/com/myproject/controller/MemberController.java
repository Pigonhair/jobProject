package com.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.myproject.model.MemberVO;
import com.myproject.service.MemberService;
import com.myproject.service.MemberServiceImpl;

import lombok.extern.log4j.Log4j;

/* 
@Controller ������̼��� ��� �ش� Ŭ������ �������� ������ �ν��ϵ��� �ϱ� �����̰�, 
@RequestMapping("/member/*")�� ��� '/member'�� �����ϴ� ��� ó���� MemberController.java �� �ϵ��� �����ϴ� ���� */

@Controller
//@RequestMapping("/member/*")
@Log4j
public class MemberController {

	@Autowired
	private MemberService memberService;

	@PostMapping("/login")
	// => @RequestMapping(value="login", method=RequestMethod.POST)
	public String LoginPost(MemberVO vo) {
		log.info("�α�����Ʈ�ѷ�����");
		log.info("MemberVO : " + vo);

		String path = "";

		MemberVO member = memberService.checkMemberIdPwd(vo);
		if (member != null) {
			// �α��� ����
			log.info("�α��� ����!");
			path = "index";
            
		} else {
			// �α��� ����
			log.info("�α��� ����!");
			path = "login";
		}

		return path;

	}

}
