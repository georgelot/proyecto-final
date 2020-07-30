package cl.cparra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registoEncomiendas")
public class EncomiendasEmpleadoController {
	
	@GetMapping
	public String registoEncomiendas() {
		String registoEncomiendas = "registoEncomiendas";
		return registoEncomiendas;
	}

}
