package com.myproject.service;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class certificationService {

	public static void certifiedPhoneNumber(String phoneNumber, String cerNum) {

		String api_key = "NCSMZ3ONPYOX22AE";
		String api_secret = "PW6YXWUIVYI4MYBHZ1KFKVC5MX7FGESV";
		Message coolsms = new Message(api_key, api_secret);

		// 4 params(to, from, type, text) are mandatory. must be filled
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", phoneNumber); // ������ȭ��ȣ
		params.put("from", "01048175232"); // �߽���ȭ��ȣ. �׽�Ʈ�ÿ��� �߽�,���� �Ѵ� ���� ��ȣ�� �ϸ� ��
		params.put("type", "SMS");
		params.put("text", "PoTube �޴������� �׽�Ʈ �޽��� : ������ȣ��" + "[" + cerNum + "]" + "�Դϴ�.");
		params.put("app_version", "test app 1.2"); // application name and version

		try {
			JSONObject obj = (JSONObject) coolsms.send(params);
			System.out.println(obj.toString());
		} catch (CoolsmsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
		}

	}
}
