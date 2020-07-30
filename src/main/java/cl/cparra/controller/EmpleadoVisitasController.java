package cl.cparra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registroVisitas")
public class EmpleadoVisitasController {

	@GetMapping
	public String registroVisitas() {
		String registroVisitas = "registroVisitas";
		return registroVisitas;
	}
}
