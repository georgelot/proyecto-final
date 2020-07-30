package cl.cparra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/indexResidentes")
public class HomeResidenteController {
	
	@GetMapping
	public String indexResidentes() {
		String indexResidentes = "indexResidentes";
		return indexResidentes;
	}

}
