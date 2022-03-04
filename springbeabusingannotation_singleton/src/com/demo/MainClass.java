package com.demo;
//spring demo scopes using annotation
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.config.AppConfig;
import com.demo.pojo.Message;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Message m = context.getBean(Message.class);
		m.setMessage("hii hello there ");
		System.out.println(m.getMessage());
	}

}
