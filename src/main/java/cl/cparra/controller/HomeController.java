package cl.cparra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {
	
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);

	@GetMapping({"","/","/login"})
	public String login() {
		String login = "login";
		log.info("ok");
		return login;
	}
}
