package cl.cparra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registroVisitas")
public class EmpleadoVisitasController {
	
	private static final Logger log = LoggerFactory.getLogger(EmpleadoVisitasController.class);


	@GetMapping
	public String registroVisitas() {
		String registroVisitas = "registroVisitas";
		log.info("ok");
		return registroVisitas;
	}
}
