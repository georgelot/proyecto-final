package cl.cparra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/misEncomiendas")
public class ResidenteEncomiendasController {

	@GetMapping
	public String misEncomiendas() {
		String misEncomiendas = "misEncomiendas";
		return misEncomiendas;
	}
}
