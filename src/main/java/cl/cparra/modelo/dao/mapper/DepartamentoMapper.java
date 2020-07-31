package cl.cparra.modelo.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;

import cl.cparra.modelo.entity.DepartamentoEntidad;

public class DepartamentoMapper implements RowMapper<DepartamentoEntidad>{

	private static final Logger log = LoggerFactory.getLogger(DepartamentoMapper.class);

	@Override
	public DepartamentoEntidad mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		DepartamentoEntidad departamento = new DepartamentoEntidad();
		
		Integer id = rs.getInt("id");
		Integer numero = rs.getInt("numero");
		
		departamento.setId(id);
		departamento.setNumero(numero);
		log.info("RowMap departamento ok " + departamento);
		return null;
	}
}
