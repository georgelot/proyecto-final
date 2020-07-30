package cl.cparra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mantenedorEmpleados")
public class AdminEmpleadoController {

	@GetMapping
	public String crudConserjes() {
		String mantenedorConserjes = "mantenedorEmpleados";
		return mantenedorConserjes;
	}
}
