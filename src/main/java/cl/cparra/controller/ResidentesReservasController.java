package cl.cparra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/misEspacios")
public class ResidentesReservasController {
	
	private static final Logger log = LoggerFactory.getLogger(ResidentesReservasController.class);
	
	@GetMapping
	public String reservarEspacios() {
		String misEspacios = "misEspacios";
		log.info("ok");
		return misEspacios;
	}
}
