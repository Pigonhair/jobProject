package com.myproject.service;

import java.util.List;

import com.myproject.model.ArticleVO;

public interface ArticleService {
	//����Ʈ ��������
	public List<ArticleVO> selectArticlelist(String a_id);
	
	//���ۼ��ϱ�
	public int createArticle(ArticleVO vo);
}
