package cl.cparra.controller;

import java.io.Serializable;
import java.util.List;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.cparra.modelo.entity.DepartamentoEntidad;
import cl.cparra.modelo.entity.UsuarioEntidad;
import cl.cparra.service.DepartamentoService;
import cl.cparra.service.ResidenteService;

@Controller
@RequestMapping("mantenedorResidentes")
public class AdminResidenteController implements Serializable {
	private static final long serialVersionUID = 2910211444416719265L;
	// private static final Logger log =
	// LoggerFactory.getLogger(AdminResidenteController.class);

	@Autowired
	private ResidenteService residenteService;

	@Autowired
	private DepartamentoService departamentoService;

	@GetMapping("/listar")
	public String residentes(ModelMap modelo) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		modelo.addAttribute("username", name);
		List<UsuarioEntidad> residentes = residenteService.getAll();
		List<DepartamentoEntidad> departamento = departamentoService.listarDepartamentos();
		modelo.addAttribute("departamento", departamento);
		modelo.addAttribute("residentes", residentes);
		return "admin/mantenedorResidentes";
	}
	
	@GetMapping("/crear")
	public String crearResidente(ModelMap modelo) {
		UsuarioEntidad residente = new UsuarioEntidad();
		List<DepartamentoEntidad> departamento = departamentoService.listarDepartamentos();
		modelo.addAttribute("residente", residente);
		modelo.addAttribute("departamento", departamento);
		return "admin/mantenedorResidentes";
		
		
	}
}
