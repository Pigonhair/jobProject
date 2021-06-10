package com.myproject.controller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myproject.service.certificationService;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class MessageController {
	@GetMapping("/check/sendSMS")
	public @ResponseBody 
	String sendSMS(String phoneNumber) {

		Random rand = new Random();
		String numStr = "";
		for (int i = 0; i < 4; i++) {
			String ran = Integer.toString(rand.nextInt(10));
			numStr += ran;
		}

		log.info("수신자 번호 : " + phoneNumber);
		log.info("인증번호 : " + numStr);
		certificationService.certifiedPhoneNumber(phoneNumber, numStr);
		return numStr;
	}

}
