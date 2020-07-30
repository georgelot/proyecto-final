package cl.cparra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mantenedorConserjes")
public class ConserjeController {

	@GetMapping
	public String crudConserjes() {
		String mantenedorConserjes = "mantenedorConserjes";
		return mantenedorConserjes;
	}
}
