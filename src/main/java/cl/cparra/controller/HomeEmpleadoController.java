package cl.cparra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/indexEmpleados")
public class HomeEmpleadoController {
	
	@GetMapping
	public String indexEmpleados() {
		String indexEmpleados = "indexEmpleados";
		return indexEmpleados;
	}

}
