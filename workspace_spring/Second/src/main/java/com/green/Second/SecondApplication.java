package com.green.Second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SecondApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SecondApplication.class, args);

		//스프링 컨테이너가 만들어준 모든 객체의 이름을 배열로 가져오는 명령어
		//Bean = 스프링에서는 객체를 나타냄
		String[] beanNames = context.getBeanDefinitionNames();

		for (String beanName : beanNames){
			Object beanType = context.getBean(beanName);
			System.out.println("객체명 : " + beanName + ", 자료형 : " + beanType);
		}

	}

}
