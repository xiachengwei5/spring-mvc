package com.xia.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xia.model.UserInfo;
import com.xia.services.UserInfoService;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springmvc.xml");
		UserInfoService service = ctx.getBean(UserInfoService.class);
		List<UserInfo> userList = service.selectAllUsers();
		
		for(UserInfo user : userList) {
			System.out.println(user.getUserName());
		}
	}
}
