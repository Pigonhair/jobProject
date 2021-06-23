package com.myproject.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myproject.mapper.ArticleMapper;
import com.myproject.model.ArticleVO;

@Service("ArticleService")
public class ArticleServiceImpl implements ArticleService{
	
	@Resource
	ArticleMapper articleMapper;

	@Override
	public List<ArticleVO> selectArticlelist(String a_id) {
		return articleMapper.selectArticlelist(a_id);
	}

	@Override
	public int createArticle(ArticleVO vo) {
		int n = 0;
		vo.setA_num(articleMapper.selectArt_num());
		n = articleMapper.createArticle(vo);
		return n;
	}

}
