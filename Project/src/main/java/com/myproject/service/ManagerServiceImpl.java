package com.myproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.mapper.MemberMapper;
import com.myproject.model.MemberVO;
import com.myproject.util.SHA256Util;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class ManagerServiceImpl implements ManagerService {
	
	@Autowired
	private MemberMapper mapper;

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
	public int RestoreMember(String m_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	}
