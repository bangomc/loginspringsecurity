package com.cris.login;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginApplication.class, args);
		//BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		//System.out.println(encoder.encode("adminadmin"));
	}
}
