package com.example.demo;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HoraServerController {
		
	@RequestMapping("/horaServer")
	private String index(ModelMap map) {
		map.put("fechaLocal",new Date());
		return "horaServer";
	}
}
