package com.myproject.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.myproject.model.MemberVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class MemberMapperTests {
 
     private static final Logger log = LoggerFactory.getLogger(MemberMapperTests.class);
     
     @Autowired
     private MemberMapper mapper;
 
     @Test
     public void testEnroll() {
         
         MemberVO vo = new MemberVO();
               
         vo.setM_id("mapper test");
         vo.setM_pwd("mapper test");
         vo.setM_name("mapper test");
         vo.setM_address("mapper test");
         vo.setM_phone("mapper test");
         vo.setM_department("mapper test");
         vo.setM_grade("mapper test");
         vo.setM_img("mapper test");
         vo.setCache("mapper test");
         vo.setToken("mapper test");
         
         mapper.insertMember(vo);
         
     }
     
 
}