package cl.cparra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mantenedorResidentes")
public class AdminResidenteController {
	
	@GetMapping
	public String crudResidentes() {
		String crudResidentes = "mantenedorResidentes";
		return crudResidentes;
	}

}
