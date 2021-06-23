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
@Controller 어노테이션의 경우 해당 클래스를 스프링의 빈으로 인식하도록 하기 위함이고, 
@RequestMapping("/member/*")의 경우 '/member'로 시작하는 모든 처리를 MemberController.java 가 하도록 지정하는 역할 */

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
		log.info("로그인컨트롤러들어옴");

		// 클라이언트가 보낸 ID값
		String ID = m_id.trim();
		log.info("id값은: "+ ID);
		// 클라이언트가 보낸 PWD값
		String PWD = m_pwd.trim();
		log.info("pwd값은: "+ PWD);
		
		HttpSession session=request.getSession();
		MemberVO member = memberService.checkMemberIdPwd(ID,PWD);
		if (member != null) {
			// 로그인 성공
			log.info("로그인 성공!");			
			session.setAttribute("loginOK", JsonData.MemverJsonData(member));
			session.setAttribute("loginId", member.getM_id());
			session.setAttribute("loginName", member.getM_name());
			return "1";

		} else {
			// 로그인 실패
			log.info("로그인 실패!");
			return "0";
		}
	
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

	@ResponseBody
	@PostMapping("/idCheck")
	// => @RequestMapping(value="idCheck", method=RequestMethod.POST)
	public String idCheckPost(@RequestParam("id") String m_id) {
		log.info("idCheck컨트롤러들어옴");

		// 클라이언트가 보낸 ID값
		String ID = m_id.trim();
		log.info("id값은: "+ ID);
		
		MemberVO member = memberService.IdCheck(ID);
			
		if(member != null) {//결과 값이 있으면 아이디 존재	
			return "-1";
		} else {		//없으면 아이디 존재 X
			log.info("null");
			return "0";
		}
	}
	
	
	@RequestMapping(value="userList", method=RequestMethod.GET)
	public ModelAndView UserListGet() {
		log.info("사용자 리스트");

		List<HashMap<String, MemberVO>> vo = memberService.UserList();
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/account/userdelete");
	    mav.addObject("list", vo);
		
		return mav;
	}

}
