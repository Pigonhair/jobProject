package com.myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myproject.model.ArticleVO;
import com.myproject.service.ArticleService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class ArticleController {
	@Autowired
	private ArticleService articleService;

	
	@PostMapping("/articlelist")
	public ModelAndView portfoliolistPost(@RequestParam("a_id") String a_id) {
		// ÃÑ ±ÛÀÇ °¹¼ö ¶Ç´Â °Ë»öµÈ ±ÛÀÇ °¹¼ö

		log.info("ArticleController µé¾î¿È");
		log.info(a_id);
		List<ArticleVO> list = articleService.selectArticlelist(a_id);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/portfolio");
		mav.addObject("list", list);
		return mav;

	}
}
