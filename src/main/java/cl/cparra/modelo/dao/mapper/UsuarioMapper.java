package cl.cparra.modelo.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import cl.cparra.modelo.entity.UsuarioEntidad;

public class UsuarioMapper implements RowMapper<UsuarioEntidad>{
	
	private static final Logger log = LoggerFactory.getLogger(UsuarioMapper.class);

	@Override
	public UsuarioEntidad mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		UsuarioEntidad usuario = new UsuarioEntidad();
		
		Integer id = rs.getInt("id");
		String nombre = rs.getString("nombre");
		String apellido = rs.getString("apellido");
		String rut = rs.getString("rut");
		String telefono = rs.getString("telefono");
		String correo = rs.getString("correo");
		String contrasenia = rs.getString("contrasenia");

		
		usuario.setId(id);
		usuario.setNombre(nombre);
		usuario.setApellido(apellido);
		usuario.setRut(rut);
		usuario.setTelefono(telefono);
		usuario.setCorreo(correo);
		usuario.setContrasenia(contrasenia);

		log.info("RowMap usuario ok " + usuario);		
		return usuario;
		
	}
}
