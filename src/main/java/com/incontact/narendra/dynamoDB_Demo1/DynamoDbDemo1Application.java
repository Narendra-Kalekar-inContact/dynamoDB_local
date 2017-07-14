package com.incontact.narendra.dynamoDB_Demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.incontact.narendra.dynamoDB_Demo1")
public class DynamoDbDemo1Application {
	public static void main(String[] args) {
		SpringApplication.run(DynamoDbDemo1Application.class, args);
	}
}
