package com.springboot.whp.whpdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WhpDemoApplication {
	@Value("${book.author}")
	private String author;

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String index(){
		return "book is write by "+ author;
	}
	public static void main(String[] args) {
		SpringApplication application=new SpringApplication(WhpDemoApplication.class);
		application.run(args);
	}
}
