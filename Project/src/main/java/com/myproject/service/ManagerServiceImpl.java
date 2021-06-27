package com.myproject.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.mapper.ManagerMapper;
import com.myproject.mapper.MemberMapper;
import com.myproject.model.MemberVO;
import com.myproject.util.SHA256Util;

import lombok.extern.log4j.Log4j;

@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	private MemberMapper mapper;
	@Autowired
	private ManagerMapper managerMapper;

	@Override
	public int RemoveMember(String m_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int DeleteMember(String m_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List RestoreMember(List list) {
		List gradeList = managerMapper.Restore(list);
		return gradeList;

	}
}
