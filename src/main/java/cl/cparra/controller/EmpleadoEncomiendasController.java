package cl.cparra.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("registoEncomiendas")
public class EmpleadoEncomiendasController {
	
	private static final Logger log = LoggerFactory.getLogger(EmpleadoEncomiendasController.class);
	
	@GetMapping
	public String encomiendas(ModelMap modelo) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		modelo.addAttribute("username", name);
		log.info("vista encomiendas empleados ok");
		return "empleado/registoEncomiendas";
	}

}
