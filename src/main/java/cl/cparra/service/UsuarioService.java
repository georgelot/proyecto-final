package cl.cparra.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import cl.cparra.modelo.dao.UsuarioDao;
import cl.cparra.modelo.entity.UsuarioEntidad;

public class UsuarioService {
	private static final Logger log = LoggerFactory.getLogger(UsuarioService.class);

	@Autowired
	UsuarioDao usuarioDao;
		
	 @Transactional(readOnly = true)
	 public List<UsuarioEntidad> getAll(){
	 return usuarioDao.findAll();
	 }

	public void insertarUsuario(UsuarioEntidad usuario) {
		usuario.getNombre();
		usuario.getApellido();
		usuario.getRut();
		usuario.getTelefono();
		usuario.getCorreo();
		usuario.getContrasenia();
		usuario.getRol();
		log.info("Insertado ok" + usuario);

	}

	public void eliminarUsuario(Integer id) {
		UsuarioEntidad usuario = usuarioDao.findById(id).orElse(null);
		usuarioDao.delete(usuario);
		log.info("Eliminado ok" + id);

	}

	public void actualizarUsuario(UsuarioEntidad usuario) {
		log.info("actualizado ok");
		usuarioDao.save(usuario);
	}

	public List<UsuarioEntidad> traerTodos() {
		return usuarioDao.findAll();

	}
}
