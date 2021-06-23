package com.myproject.mapper;

import java.util.List;

import com.myproject.model.ArticleVO;

public interface ArticleMapper {
	
	/* Art_num 1씩 자동 증가하는 시퀀스 값 가져오기 */
	public int selectArt_num();

	// 글리스트 가져오기
	public List<ArticleVO> selectArticlelist(String a_id);
	
	// 글등록
	public int createArticle(ArticleVO vo);

}
