package com.cg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitRepositoryDemoApplication {

	public static void main(String[] args) {
	System.out.println("entered into GitRepositoryDemoApplication");
	System.out.println("added branch through git cli");
		SpringApplication.run(GitRepositoryDemoApplication.class, args);
	}

}
