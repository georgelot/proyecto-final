package cl.cparra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reservarEspacios")
public class ResidentesReservasController {
	
	@GetMapping
	public String reservarEspacios() {
		String reservarEspacios = "reservarEspacios";
		return reservarEspacios;
	}
}
