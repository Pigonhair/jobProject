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
@Controller 어노테이션의 경우 해당 클래스를 스프링의 빈으로 인식하도록 하기 위함이고, 
@RequestMapping("/member/*")의 경우 '/member'로 시작하는 모든 처리를 MemberController.java 가 하도록 지정하는 역할 */

@Controller
//@RequestMapping("/member/*")
@Log4j
public class MemberController {

	@Autowired
	private MemberService memberService;

	@PostMapping("/login")
	// => @RequestMapping(value="login", method=RequestMethod.POST)
	public String LoginPost(MemberVO vo) {
		log.info("로그인컨트롤러들어옴");
		log.info("MemberVO : " + vo);

		String path = "";

		MemberVO member = memberService.checkMemberIdPwd(vo);
		if (member != null) {
			// 로그인 성공
			log.info("로그인 성공!");
			path = "index";
            
		} else {
			// 로그인 실패
			log.info("로그인 실패!");
			path = "/login";
		}

		return path;
	}
	
	@PostMapping("/join")
	// => @RequestMapping(value="login", method=RequestMethod.POST)
	public String joinPost(MemberVO vo) {
		log.info("회원가입컨트롤러들어옴");

		String path = "";
		
		int n = memberService.insertMember(vo);
		log.info("n값은 : " + n);
		if (n > 0) {
			log.info("회원가입 성공!");
			path = "index";
            
		} else {
			log.info("회원가입 실패!");
			return "";
		}

		return path;
	}
	
	

}
