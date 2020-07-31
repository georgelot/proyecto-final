package cl.cparra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/misEncomiendas")
public class ResidenteEncomiendasController {
	
	private static final Logger log = LoggerFactory.getLogger(ResidenteEncomiendasController.class);

	@GetMapping
	public String misEncomiendas() {
		String misEncomiendas = "misEncomiendas";
		log.info("ok");
		return misEncomiendas;
	}
}
