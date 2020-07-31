package cl.cparra.modelo.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import cl.cparra.modelo.entity.VisitaEntidad;

public class VisitaMapper implements RowMapper<VisitaEntidad>{
	
	private static final Logger log = LoggerFactory.getLogger(VisitaMapper.class);

	@Override
	public VisitaEntidad mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		VisitaEntidad visita = new VisitaEntidad();
		
		Integer id = rs.getInt("id");
	    String nombre= rs.getString("nombre");
	    String apellido = rs.getString("apellido");
	    Integer dapartamento = rs.getInt("dapartamento");
	    Integer fecha = rs.getInt("fecha");
	    Integer horaIngreso = rs.getInt("horaIngreso");
	    Integer horaSalida = rs.getInt("horaSalida");
	    
	    visita.setId(id);
	    visita.setNombre(nombre);
	    visita.setApellido(apellido);
	    visita.setDapartamento(dapartamento);
	    visita.setFecha(fecha);
	    visita.setHoraIngreso(horaIngreso);
	    visita.setHoraSalida(horaSalida);
	    		
		log.info("RowMap visita ok" + visita);
		return null;
	}
}
