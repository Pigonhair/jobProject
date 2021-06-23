package com.myproject.service;

import java.util.List;

import com.myproject.model.ArticleVO;

public interface ArticleService {
	//리스트 가져오기
	public List<ArticleVO> selectArticlelist(String a_id);
	
	//글작성하기
	public int createArticle(ArticleVO vo);
}
