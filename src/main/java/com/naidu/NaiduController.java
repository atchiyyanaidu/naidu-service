package com.naidu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class NaiduController {
	@GetMapping("/say")
	public String sayHello() {
		return "welcome to naidu world";
		
				
		
	}
	


}
