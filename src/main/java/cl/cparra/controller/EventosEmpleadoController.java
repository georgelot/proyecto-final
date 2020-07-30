package cl.cparra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registroEventos")
public class EventosEmpleadoController {

	@GetMapping
	public String registroEventos() {
		String registroEventos = "registroEventos";
		return registroEventos;
	}
}
