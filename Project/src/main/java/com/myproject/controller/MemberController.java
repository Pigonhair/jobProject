package com.myproject.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.myproject.model.MemberVO;
import com.myproject.service.MemberService;

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
			path = "/login";
		}

		return path;
	}
	
	@PostMapping("/login2")
	public Map<String, String> LoginPost2(MemberVO vo) {
		log.info("�α���2��Ʈ�ѷ�����");
		Map<String,String> map = new HashMap<String,String>();
		
		return map;
	}

}
