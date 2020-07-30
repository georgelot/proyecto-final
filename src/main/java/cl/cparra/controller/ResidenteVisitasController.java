package cl.cparra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registrarVisitas")
public class ResidenteVisitasController {
	
	@GetMapping
	public String registrarVisitas() {
		String registrarVisitas = "registrarVisitas";
		return registrarVisitas;
	}

}
