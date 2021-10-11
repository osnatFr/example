package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.TextUtils;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Hellow All" + TextUtils.getText();
	}

}
