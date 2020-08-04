package cl.cparra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class HomeController {
	
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);

	@GetMapping("/index")
	public String login() {
		String index = "index";
		log.info("ok");
		return index;
	}
}
