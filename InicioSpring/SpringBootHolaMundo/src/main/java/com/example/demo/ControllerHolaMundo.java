package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerHolaMundo {

	@RequestMapping("/hi")
	public String holaMundo() {
		
		return "Hola Mundo";
	}
}
