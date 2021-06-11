package com.myproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

	@ResponseBody
	@PostMapping("/login")
	// => @RequestMapping(value="login", method=RequestMethod.POST)
	public String LoginPost(@RequestParam("id") String m_id,
			@RequestParam("pwd") String m_pwd) {
		log.info("�α�����Ʈ�ѷ�����");

		// Ŭ���̾�Ʈ�� ���� ID��
		String ID = m_id.trim();
		log.info("id����: "+ ID);
		// Ŭ���̾�Ʈ�� ���� PWD��
		String PWD = m_pwd.trim();
		log.info("pwd����: "+ PWD);
		
		
		MemberVO member = memberService.checkMemberIdPwd(ID,PWD);
		if (member != null) {
			// �α��� ����
			log.info("�α��� ����!");
			return "1";

		} else {
			// �α��� ����
			log.info("�α��� ����!");
			return "0";
		}
	
	}
	

	@PostMapping("/join")
	// => @RequestMapping(value="login", method=RequestMethod.POST)
	public String joinPost(MemberVO vo) {
		log.info("ȸ��������Ʈ�ѷ�����");

		String path = "";

		int n = memberService.insertMember(vo);
		log.info("n���� : " + n);
		if (n > 0) {
			log.info("ȸ������ ����!");
			path = "index";

		} else {
			log.info("ȸ������ ����!");
			return "";
		}

		return path;
	}

	@ResponseBody
	@PostMapping("/idCheck")
	// => @RequestMapping(value="idCheck", method=RequestMethod.POST)
	public String idCheckPost(@RequestParam("id") String m_id) {
		log.info("idCheck��Ʈ�ѷ�����");

		// Ŭ���̾�Ʈ�� ���� ID��
		String ID = m_id.trim();
		log.info("id����: "+ ID);
		
		MemberVO member = memberService.IdCheck(ID);
			
		if(member != null) {//��� ���� ������ ���̵� ����	
			return "-1";
		} else {		//������ ���̵� ���� X
			log.info("null");
			return "0";
		}
		
				
	}

}
