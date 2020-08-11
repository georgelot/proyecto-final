package cl.cparra.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cl.cparra.modelo.dao.UsuarioDao;
import cl.cparra.modelo.entity.UsuarioEntidad;

@Service
public class ResidenteService {
	private static final Logger log = LoggerFactory.getLogger(ResidenteService.class);

	@Autowired
	UsuarioDao usuarioDao;

		
	 @Transactional(readOnly = true)
	 public List<UsuarioEntidad> getAll(){
	 return usuarioDao.findAll();
	 }
	@Transactional(readOnly = true)
	public void insertarUsuario(UsuarioEntidad usuario) {
		/*
		 * usuario.getNombre(); usuario.getApellido(); usuario.getRut();
		 * usuario.getTelefono(); usuario.getCorreo(); usuario.getContrasenia();
		 * usuario.getRol(); usuario.getDepartamentos();
		 */
		usuarioDao.save(usuario);
		log.info("Insertado ok" + usuario);

	}
	@Transactional(readOnly = true)
	public void eliminarUsuario(Integer id) {
		UsuarioEntidad usuario = usuarioDao.findById(id).orElse(null);
		usuarioDao.delete(usuario);
		log.info("Eliminado ok" + id);

	}
	@Transactional(readOnly = true)
	public void actualizarUsuario(Integer id) {
		UsuarioEntidad usuario = usuarioDao.findById(id).orElse(null);
		usuarioDao.delete(usuario);
		log.info("Actualizado ok" + id);
	}
	@Transactional(readOnly = true)
	public List<UsuarioEntidad> traerTodos() {
		return usuarioDao.findAll();
	}
	@Transactional(readOnly = true)
	public UsuarioEntidad buscarPorId(Integer id) {
		return usuarioDao.findById(id).orElse(null);
	}
}
