package cl.cparra.modelo.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import cl.cparra.modelo.entity.EventoEntidad;

public class EventoMapper implements RowMapper<EventoEntidad>{

	private static final Logger log = LoggerFactory.getLogger(EventoMapper.class);
	
	EventoEntidad evento = new EventoEntidad();
	
	@Override
	public EventoEntidad mapRow(ResultSet rs, int rowNum) throws SQLException {
		Integer id = rs.getInt("id");
		String espacio = rs.getString("espacio");
		Integer fecha = rs.getInt("fecha");
		Integer horaInicio = rs.getInt("horaInicio");
		Integer horaFin = rs.getInt("horaFin");
		
		evento.setId(id);
		evento.setEspacio(espacio);
		evento.setFecha(fecha);
		evento.setHoraInicio(horaInicio);
		evento.setHoraFin(horaFin);
				
		log.info("RowMap evento ok " + evento);
		return null;
	}
}
