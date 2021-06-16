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

}
