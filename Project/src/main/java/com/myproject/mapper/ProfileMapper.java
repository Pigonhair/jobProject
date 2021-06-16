package com.myproject.mapper;

import java.util.List;

import com.myproject.model.ProfileVO;

public interface ProfileMapper {

	// Mapper
		public List<ProfileVO> selectProfilelist();
}
