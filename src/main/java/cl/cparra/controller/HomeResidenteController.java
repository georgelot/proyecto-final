package cl.cparra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/indexResidentes")
public class HomeResidenteController {
	
	private static final Logger log = LoggerFactory.getLogger(HomeResidenteController.class);
	
	@GetMapping
	public String indexResidentes() {
		String indexResidentes = "indexResidentes";
		log.info("ok");
		return indexResidentes;
	}

}
