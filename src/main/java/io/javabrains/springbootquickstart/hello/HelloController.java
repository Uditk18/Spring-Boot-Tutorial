package io.javabrains.springbootquickstart.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//this is a spring controller

@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String sayHi(){
		return "HI";
	}

}
