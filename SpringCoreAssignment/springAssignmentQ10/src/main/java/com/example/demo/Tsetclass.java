package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tsetclass {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
	}
}
