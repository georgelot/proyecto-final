package cl.cparra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/indexEmpleados")
public class HomeEmpleadoController {
	
	private static final Logger log = LoggerFactory.getLogger(HomeEmpleadoController.class);

	
	@GetMapping
	public String indexEmpleados() {
		String indexEmpleados = "indexEmpleados";
		log.info("ok");
		return indexEmpleados;
	}

}
