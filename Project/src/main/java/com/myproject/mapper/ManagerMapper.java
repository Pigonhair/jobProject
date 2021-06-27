package com.myproject.mapper;


import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.myproject.model.MemberVO;

public interface ManagerMapper {
	
	public List Restore(List list);
	

}
