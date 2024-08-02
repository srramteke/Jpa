package com.example.demo;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		Repository bean = run.getBean(Repository.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id to find");
		int id=sc.nextInt();
		Optional<Student> findById = bean.findById(id);
		boolean existsById = bean.existsById(id);
		if(existsById) {
			System.out.println("data present");
			System.out.println(findById);
		}
		else {
			System.out.println("data not available");
		}
	}

}
