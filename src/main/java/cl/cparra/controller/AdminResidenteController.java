package cl.cparra.controller;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.multipart.MultipartFile;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;

//import cl.cparra.modelo.dao.UsuarioDao;
//import cl.cparra.modelo.entity.UsuarioEntidad;
import cl.cparra.service.ResidenteService;


@Controller
@RequestMapping("/mantenedorResidentes")
public class AdminResidenteController implements Serializable{
	private static final long serialVersionUID = 2910211444416719265L;
	private static final Logger log = LoggerFactory.getLogger(AdminResidenteController.class);
	
	@Autowired
	private ResidenteService residenteService;

	@GetMapping
	public String residentes(ModelMap modelo) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		modelo.addAttribute("username", name);
		log.info("vista mantenedor residentes ok");
		return "admin/mantenedorResidentes";
	}
	
	/*
	 * @PostMapping public String registroResidente( RedirectAttributes attributes,
	 * 
	 * @ModelAttribute UsuarioEntidad usuario){ UsuarioEntidad responseEntidad =
	 * residenteService.insertarUsuario(usuario);
	 * attributes.addFlashAttribute("message","usuario") }
	 */
}
