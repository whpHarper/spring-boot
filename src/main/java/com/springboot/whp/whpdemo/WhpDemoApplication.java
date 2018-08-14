package com.springboot.whp.whpdemo;

import com.springboot.whp.whpdemo.config.BookConfig;
import com.springboot.whp.whpdemo.config.autoconfig.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class WhpDemoApplication {

	@Autowired
	private BookConfig bookConfig;
	@Autowired
	private HelloService helloService;

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String index(){
		return "book is write by "+ bookConfig.getTime();
	}
	@RequestMapping(value = "/sayHello",method = RequestMethod.GET)
	public String sayHello(){
		return helloService.sayHello();
	}
	public static void main(String[] args) {
		SpringApplication application=new SpringApplication(WhpDemoApplication.class);
		application.run(args);
	}
}
