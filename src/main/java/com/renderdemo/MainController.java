package com.renderdemo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MainController 
{
	@GetMapping("/hello_world")
	public String getData() {
		return "restapi deployed successfully ";
	}

}
