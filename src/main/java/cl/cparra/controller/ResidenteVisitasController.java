package cl.cparra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/misVisitas")
public class ResidenteVisitasController {
	
	private static final Logger log = LoggerFactory.getLogger(ResidenteVisitasController.class);
	
	@GetMapping
	public String misVisitas() {
		String misVisitas = "misVisitas";
		log.info("ok");
		return misVisitas;
	}

}
