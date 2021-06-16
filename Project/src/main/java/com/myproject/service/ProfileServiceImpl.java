package com.myproject.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.myproject.mapper.ArticleMapper;
import com.myproject.mapper.ProfileMapper;
import com.myproject.model.ArticleVO;
import com.myproject.model.ProfileVO;

@Service("ProfileService")
public class ProfileServiceImpl implements ProfileService {

	@Resource
	ProfileMapper profileMapper;

	@Override
	public List<ProfileVO> selectProfilelist() {

		return profileMapper.selectProfilelist();
	}
}
