package cl.cparra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/indexAdmin")
public class HomeAdminController {
	
	@GetMapping
	public String indexAdmin() {
		String indexAdmin = "indexAdmin";
		return indexAdmin;
	}
}