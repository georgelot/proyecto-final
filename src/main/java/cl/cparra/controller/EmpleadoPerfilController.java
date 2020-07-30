package cl.cparra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/actualizaEmpleado")
public class EmpleadoPerfilController {

	@GetMapping
	public String actualizaEmpleado() {
		String actualizaEmpleado = "actualizaEmpleado";
		return actualizaEmpleado;
	}
}
