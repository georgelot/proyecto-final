package cl.cparra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registoEncomiendas")
public class EmpleadoEncomiendasController {
	
	private static final Logger log = LoggerFactory.getLogger(EmpleadoEncomiendasController.class);
	
	@GetMapping
	public String registoEncomiendas() {
		String registoEncomiendas = "registoEncomiendas";
		log.info("cargado");
		return registoEncomiendas;
	}

}
