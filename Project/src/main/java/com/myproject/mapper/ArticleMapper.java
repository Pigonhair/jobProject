package com.myproject.mapper;

import java.util.List;

import com.myproject.model.ArticleVO;

public interface ArticleMapper {
	
	/* Art_num 1�� �ڵ� �����ϴ� ������ �� �������� */
	public int selectArt_num();

	// �۸���Ʈ ��������
	public List<ArticleVO> selectArticlelist(String a_id);
	
	// �۵��
	public int createArticle(ArticleVO vo);

}
