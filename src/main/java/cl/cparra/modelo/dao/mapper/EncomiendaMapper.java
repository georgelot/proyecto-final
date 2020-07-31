package cl.cparra.modelo.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import cl.cparra.modelo.entity.EncomiendaEntidad;

public class EncomiendaMapper implements RowMapper<EncomiendaEntidad>{
	
	private static final Logger log = LoggerFactory.getLogger(EncomiendaMapper.class);

	@Override
	public EncomiendaEntidad mapRow(ResultSet rs, int rowNum) throws SQLException {

		EncomiendaEntidad encomienda = new EncomiendaEntidad();
		
		Integer id = rs.getInt("id");
		String proveedor = rs.getString("proveedor");
		Integer fecha = rs.getInt("fecha");
		boolean estado = rs.getBoolean("estado");
		
		encomienda.setId(id);
		encomienda.setProveedor(proveedor);
		encomienda.setFecha(fecha);
		encomienda.setEstado(estado);
		
		log.info("RowMap encomienda ok " + encomienda);
		return null;
	}
}
