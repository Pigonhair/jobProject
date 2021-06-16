package com.myproject.service;

import java.util.List;

import com.myproject.model.ArticleVO;

public interface ArticleService {
	public List<ArticleVO> selectArticlelist(String a_id);
}
