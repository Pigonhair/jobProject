package com.myproject.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@ResponseBody
	public String GradeChangePost(HttpServletRequest request, MemberVO vo) {

		log.info("아이디: " + vo.getM_id());
		log.info("grade: " + vo.getM_grade());

		String[] idList = vo.getM_id().split(",");
		String[] gradeList = vo.getM_grade().split(",");
		
//		java.util.List<String> list = new ArrayList<String>(Arrays.asList(idList));
//		if(list != null){
//		    for(int i = 0; i < list.size(); i++){
//		        System.out.println(list.get(i));
//		    }
//		}
//		
//		java.util.List<String> list2 = new ArrayList<String>(Arrays.asList(gradeList));
//		if(list2 != null){
//		    for(int i = 0; i < list.size(); i++){
//		        System.out.println(list2.get(i));
//		    }
//		}

//		HashMap<String, Object> map = new HashMap<String, Object>();
//		HashMap<String, Object> map2 = new HashMap<String, Object>();
//		HashMap<String, Object> map3 = new HashMap<String, Object>();

//		map.put("id", idList);
//		map2.put("grade", gradeList);

//		List list = new ArrayList<Object>();
//		list.add(map);
//		list.add(map2);
// 
		List list = new ArrayList<Object>();
        Map<String, Object> map = new HashMap<String, Object>();
      
        map.put("grade", gradeList);
        list.add(map);
        map.put("id", idList);
        list.add(map);
        log.info(list);
           
		managerService.RestoreMember(list);
		return "";
	}

}
