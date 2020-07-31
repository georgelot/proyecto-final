package cl.cparra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registroEventos")
public class EmpleadoReservasController {
	
	private static final Logger log = LoggerFactory.getLogger(EmpleadoReservasController.class);

	@GetMapping
	public String registroEventos() {
		String registroEventos = "registroEventos";
		log.info("ok");
		return registroEventos;
	}
}
