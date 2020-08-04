package cl.cparra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mantenedorResidentes")
public class AdminResidenteController {
	
	private static final Logger log = LoggerFactory.getLogger(AdminResidenteController.class);
	
	@GetMapping
	public String crudResidentes() {
		String crudResidentes = "mantenedorResidentes";
		log.info("cargado");
		return crudResidentes;
	}
	
}
