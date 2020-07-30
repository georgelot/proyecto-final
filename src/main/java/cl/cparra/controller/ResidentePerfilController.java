package cl.cparra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/actualizaResidente")
public class ResidentePerfilController {

	@GetMapping
	public String actualizaResidente() {
		String actualizaResidente = "actualizaResidente";
		return actualizaResidente;
	}
}
