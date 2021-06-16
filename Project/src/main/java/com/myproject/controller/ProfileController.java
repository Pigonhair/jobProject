package com.myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myproject.model.ProfileVO;
import com.myproject.service.ArticleService;
import com.myproject.service.ProfileService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class ProfileController {
	@Autowired
	private ProfileService profileService;


	// �� ���� ���� �Ǵ� �˻��� ���� ����
	@GetMapping("/profilelist")
	public ModelAndView portfoliolistPost() {

		log.info("ProfileController ����");
		List<ProfileVO> profilelist = profileService.selectProfilelist();

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/profile");
		mav.addObject("p_list", profilelist);
		return mav;

	}
}
