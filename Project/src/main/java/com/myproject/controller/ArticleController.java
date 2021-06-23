package com.myproject.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myproject.model.ArticleVO;
import com.myproject.service.ArticleService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class ArticleController {
	@Autowired
	private ArticleService articleService;

	// 리스트 가져오기
	@PostMapping("/articlelist")	
	public ModelAndView portfoliolistPost(HttpServletRequest request, @RequestParam("a_id") String a_id
			                               ) {
		// 총 글의 갯수 또는 검색된 글의 갯수

		log.info("ArticleController 들어옴");
		log.info(a_id);
		List<ArticleVO> list = articleService.selectArticlelist(a_id);
		HttpSession session = request.getSession();
		session.setAttribute("profileID", a_id);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/portfolio");
		mav.addObject("list", list);
		return mav;
	}

	// 글 작성하기
	@PostMapping("/createArticle")
	public String createArticle(HttpServletRequest request, ArticleVO vo
			                    ,RedirectAttributes redirectAttributes) {
                                        
		log.info("ArticleController 들어옴");
		log.info("제목:" + vo.getA_title());
		log.info("내용:" + vo.getA_content());
		log.info("동영상코드:" + vo.getA_videocode());

		HttpSession session = request.getSession();
		log.info("로그인아이디:" + session.getAttribute("loginId"));
		log.info("로그인이름:" + session.getAttribute("loginName"));

		String id = (String) session.getAttribute("loginId");
		vo.setA_id(id);
		String name = (String) session.getAttribute("loginName");
		vo.setA_writer(name);
		
		int n = articleService.createArticle(vo);
		String a_id = (String) session.getAttribute("profileID");
//		redirectAttributes.addFlashAttribute("profileID", a_id);
		redirectAttributes.addAttribute("profileID", a_id);
		
		log.info("n값은 : " + n);
//		ModelAndView mav = new ModelAndView();
		if (n > 0) {
			log.info("글등록 성공!");
			return "redirect:/showarticlelist";
		
		} else {
			log.info("글등록 실패!");
			return "redirect:/";
		}
//		return mav;
	}
	
	// 글 작성하고 리스트 다시 불러오기(PRG패턴)
	@GetMapping("/showarticlelist")
	@ResponseBody
	public ModelAndView showarticlelist(@RequestParam("profileID") String a_id){

		log.info("showarticleController 들어옴");
		log.info(a_id);
		List<ArticleVO> list = articleService.selectArticlelist(a_id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/portfolio");
		mav.addObject("list", list);
		return mav;				
	}
}
