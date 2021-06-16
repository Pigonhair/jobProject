package com.myproject.jsondata;

import java.util.HashMap;
import java.util.Map;

import com.myproject.model.MemberVO;

public class JsonData {
	

	public static Map MemverJsonData(MemberVO vo) {
		int num = vo.getM_num();
		String id = vo.getM_id();
		String pwd = vo.getM_pwd();
		String name = vo.getM_name();
		String address = vo.getM_address();
		String phone = vo.getM_phone();
		String department = vo.getM_department();
		String grade = vo.getM_grade();
		String img = vo.getM_img();
		String cache = vo.getCache();
		String token = vo.getToken();
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id",id );
		map.put("pwd",pwd );
		map.put("name",name );
		map.put("address",address );
		map.put("phone",phone );
		map.put("department",department );
		map.put("grade",grade );
		map.put("img",img );
		map.put("cache",cache );
		map.put("token",token );
		
		return map;
		
	}
}
