package cl.cparra.controller;

import java.io.Serializable;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import cl.cparra.modelo.entity.DepartamentoEntidad;
import cl.cparra.modelo.entity.UsuarioEntidad;
import cl.cparra.service.DepartamentoService;
import cl.cparra.service.ResidenteService;


 @Controller
@RequestMapping("mantenedorResidentes")
public class AdminResidenteController implements Serializable {
	private static final long serialVersionUID = 2910211444416719265L;
	private static final Logger log = LoggerFactory.getLogger(AdminResidenteController.class);

	  @Autowired
	  private ResidenteService residenteService;
	  
	  @Autowired
	  private DepartamentoService departamentoService;

	@GetMapping
	public String vistaAdmin(ModelMap modelo) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		modelo.addAttribute("username", name);
		return "admin/mantenedorResidentes";
	}
		
	  @PostMapping
	  public String listarResidentes(ModelMap modelo) { 
		  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		  String name = auth.getName(); modelo.addAttribute("username", name); 
		  List<UsuarioEntidad> residentes = residenteService.getAll();
		  List<DepartamentoEntidad> departamento = departamentoService.listarDepartamentos();
		  modelo.addAttribute("departamento", departamento);
		  modelo.addAttribute("residentes", residentes);
		  log.info("listado residentes cargado "); return "admin/mantenedorResidentes";
	  }
	 
	 	
	 @GetMapping("/crear")
	 public String crearResidente(ModelMap modelo) {
		 UsuarioEntidad residente = new UsuarioEntidad();
		 List<DepartamentoEntidad> departamento = departamentoService.listarDepartamentos();
		 modelo.addAttribute("residente", residente);
		 modelo.addAttribute("departamento", departamento);
		 return "admin/actualizaResidentes"; }
	  
	  @GetMapping("/guardar")
	  public String guardarResidentes(@ModelAttribute UsuarioEntidad usuarioIn) {
		  residenteService.insertarUsuario(usuarioIn);
		  System.out.println("residente creado con exito " + usuarioIn);
		  log.info("Residente creado con exito " + usuarioIn);
		  return "admin/mantenedorResidentes"; }
	  
	  @GetMapping("/actualizar/{id}")
	  public String actualoizarResidente(@PathVariable ("id") Integer usuario_id, ModelMap modelo) {
		  UsuarioEntidad residente = residenteService.buscarPorId(usuario_id);
		  List<DepartamentoEntidad> departamento = departamentoService.listarDepartamentos();
		  modelo.addAttribute("residente", residente);
		  modelo.addAttribute("departamento", departamento);
		  return "admin/mantenedorResidentes"; }
	  
	  @GetMapping("/eliminar/{id}")
	  public String eliminarResidente(@PathVariable ("id") Integer usuario_id) {
		  residenteService.eliminarUsuario(usuario_id);
		  log.info("Residente eliminado con exito " + usuario_id);
		  System.out.println("Registo eliminado " + usuario_id);
		  return "redirect: admin/mantenedorResidentes"; }
	 
}
