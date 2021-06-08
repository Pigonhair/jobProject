package com.myproject.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myproject.mapper.MemberMapper;
import com.myproject.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberServiceTests {

	@Autowired
	private MemberService service;

	@Test
	public void testEnroll() {

		MemberVO vo = new MemberVO();

		vo.setM_id("service test");
		vo.setM_pwd("service test");
		vo.setM_name("service test");
		vo.setM_address("service test");
		vo.setM_phone("service test");
		vo.setM_department("service test");
		vo.setM_grade("service test");
		vo.setM_img("service test");
		vo.setCache("service test");
		vo.setToken("service test");

		service.insertMember(vo);

	}

}
