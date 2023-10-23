package com.khadri.spring.boot.application.props;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.khadri.spring.boot.application.props.entity.Student;

@SpringBootApplication
public class A2022SpringBootApplicationPropertiesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication
				.run(A2022SpringBootApplicationPropertiesApplication.class, args);

		Student stdObject = context.getBean(Student.class);

		System.out.println(stdObject.getId());
		System.out.println(stdObject.getName());
		System.out.println(stdObject.getAge());
	}

}
