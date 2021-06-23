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

	// ����Ʈ ��������
	@PostMapping("/articlelist")	
	public ModelAndView portfoliolistPost(HttpServletRequest request, @RequestParam("a_id") String a_id
			                               ) {
		// �� ���� ���� �Ǵ� �˻��� ���� ����

		log.info("ArticleController ����");
		log.info(a_id);
		List<ArticleVO> list = articleService.selectArticlelist(a_id);
		HttpSession session = request.getSession();
		session.setAttribute("profileID", a_id);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/portfolio");
		mav.addObject("list", list);
		return mav;
	}

	// �� �ۼ��ϱ�
	@PostMapping("/createArticle")
	public String createArticle(HttpServletRequest request, ArticleVO vo
			                    ,RedirectAttributes redirectAttributes) {
                                        
		log.info("ArticleController ����");
		log.info("����:" + vo.getA_title());
		log.info("����:" + vo.getA_content());
		log.info("�������ڵ�:" + vo.getA_videocode());

		HttpSession session = request.getSession();
		log.info("�α��ξ��̵�:" + session.getAttribute("loginId"));
		log.info("�α����̸�:" + session.getAttribute("loginName"));

		String id = (String) session.getAttribute("loginId");
		vo.setA_id(id);
		String name = (String) session.getAttribute("loginName");
		vo.setA_writer(name);
		
		int n = articleService.createArticle(vo);
		String a_id = (String) session.getAttribute("profileID");
//		redirectAttributes.addFlashAttribute("profileID", a_id);
		redirectAttributes.addAttribute("profileID", a_id);
		
		log.info("n���� : " + n);
//		ModelAndView mav = new ModelAndView();
		if (n > 0) {
			log.info("�۵�� ����!");
			return "redirect:/showarticlelist";
		
		} else {
			log.info("�۵�� ����!");
			return "redirect:/";
		}
//		return mav;
	}
	
	// �� �ۼ��ϰ� ����Ʈ �ٽ� �ҷ�����(PRG����)
	@GetMapping("/showarticlelist")
	@ResponseBody
	public ModelAndView showarticlelist(@RequestParam("profileID") String a_id){

		log.info("showarticleController ����");
		log.info(a_id);
		List<ArticleVO> list = articleService.selectArticlelist(a_id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/portfolio");
		mav.addObject("list", list);
		return mav;				
	}
}
