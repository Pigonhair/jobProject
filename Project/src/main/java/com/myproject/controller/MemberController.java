package com.myproject.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.myproject.jsondata.JsonData;
import com.myproject.model.MemberVO;
import com.myproject.service.MemberService;

import lombok.extern.log4j.Log4j;

/* 
@Controller ������̼��� ��� �ش� Ŭ������ �������� ������ �ν��ϵ��� �ϱ� �����̰�, 
@RequestMapping("/member/*")�� ��� '/member'�� �����ϴ� ��� ó���� MemberController.java �� �ϵ��� �����ϴ� ���� */

@Controller
@Log4j

public class MemberController {

	@Autowired
	private MemberService memberService;

	@ResponseBody
	@PostMapping("/login")
	// => @RequestMapping(value="login", method=RequestMethod.POST)
	public String LoginPost(HttpServletRequest request, @RequestParam("id") String m_id,
			@RequestParam("pwd") String m_pwd) {
		log.info("�α�����Ʈ�ѷ�����");

		// Ŭ���̾�Ʈ�� ���� ID��
		String ID = m_id.trim();
		log.info("id����: "+ ID);
		// Ŭ���̾�Ʈ�� ���� PWD��
		String PWD = m_pwd.trim();
		log.info("pwd����: "+ PWD);
		
		HttpSession session=request.getSession();
		MemberVO member = memberService.checkMemberIdPwd(ID,PWD);
		if (member != null) {
			// �α��� ����
			log.info("�α��� ����!");			
			session.setAttribute("loginOK", JsonData.MemverJsonData(member));
			session.setAttribute("loginId", member.getM_id());
			session.setAttribute("loginName", member.getM_name());
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
	
	
	@RequestMapping(value="userList", method=RequestMethod.GET)
	public ModelAndView UserListGet() {
		log.info("����� ����Ʈ");

		List<HashMap<String, MemberVO>> vo = memberService.UserList();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/account/userdelete");
	    mav.addObject("list", vo);
		
		return mav;
	}

}
