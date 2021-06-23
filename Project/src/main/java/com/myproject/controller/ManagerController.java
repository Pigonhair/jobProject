package com.myproject.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myproject.jsondata.JsonData;
import com.myproject.model.MemberVO;
import com.myproject.service.ManagerService;

import lombok.extern.log4j.Log4j;

/* 
@Controller 어노테이션의 경우 해당 클래스를 스프링의 빈으로 인식하도록 하기 위함이고, 
 */

@Controller
@Log4j

public class ManagerController {

	@Autowired
	private ManagerService managerService;

	@GetMapping("/m_delete")
	// => @RequestMapping(value="login", method=RequestMethod.POST)
	public String DeletePost(HttpServletRequest request, MemberVO vo) {
		log.info("계정 삭제");
		
		return "";
	}
	
	@GetMapping("/m_remove")
	// => @RequestMapping(value="login", method=RequestMethod.POST)
	public String RemovePost(HttpServletRequest request, MemberVO vo) {
		log.info("계정 영구삭제");
		
		return "";
	}
	
	@GetMapping("/m_restore")
	// => @RequestMapping(value="login", method=RequestMethod.POST)
	public String RestorePost(HttpServletRequest request, MemberVO vo) {
		log.info("계정 복구");
		
		return "";
	}
	
	@PostMapping("/m_grade")
	   // => @RequestMapping(value="login", method=RequestMethod.POST)
	   public String GradeChangePost(HttpServletRequest request, MemberVO vo) {
	      log.info("계정 등급 변경");
	      
	      
	      log.info("아이디값 : " + vo.getM_id());
	      log.info("등급 : " + vo.getM_grade());
	      
	      return "";
	   }

}
