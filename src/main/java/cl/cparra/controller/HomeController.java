package cl.cparra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class HomeController {
	
	public String index() {
		String index = "index";
		return index;
	}
}
