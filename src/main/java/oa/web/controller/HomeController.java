package oa.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("index")
	public String tiles() {
		return "index";
	}
	@RequestMapping("person")
	public String person() {
		return "person-alaffairs";
	}
	
}
