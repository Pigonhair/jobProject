package com.myproject.mapper;

import java.util.List;

import com.myproject.model.ArticleVO;

public interface ArticleMapper {

	// Mapper
	public List<ArticleVO> selectArticlelist(String a_id);

}
