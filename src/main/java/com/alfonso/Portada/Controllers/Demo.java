package com.alfonso.Portada.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
public class Demo {
	
	@GetMapping("/Portada")
	public String Portada() {
		return "Portad";
	}

}
