package com.spring.google.sso.SpringSSOGoogle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
public class SpringSsoGoogleApplication {
	@GetMapping

	public String welcome(){
		return "Welcome to Google !!";
	}
	@GetMapping("/userName")
	public String userName(Principal principal){
		System.out.println("username:"+principal.getName());

		return principal.getName();
	}
	@GetMapping("/userinfo")
	public Principal userinfo(Principal principal){
		System.out.println("userInfo:"+principal.getName());

		return principal;
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringSsoGoogleApplication.class, args);
	}

}
