package cl.cparra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/actualizaResidente")
public class ResidentePerfilController {
	
	private static final Logger log = LoggerFactory.getLogger(ResidentePerfilController.class);

	@GetMapping
	public String actualizaResidente() {
		String actualizaResidente = "actualizaResidente";
		log.info("ok");
		return actualizaResidente;
	}
}
