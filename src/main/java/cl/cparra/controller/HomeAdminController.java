package cl.cparra.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/indexAdmin")
public class HomeAdminController {
	
	private static final Logger log = LoggerFactory.getLogger(HomeAdminController.class);
	
	@GetMapping
	public String indexAdmin() {
		String indexAdmin = "indexAdmin";
		log.info("ejecutada index admin");
		return indexAdmin;
	}
}