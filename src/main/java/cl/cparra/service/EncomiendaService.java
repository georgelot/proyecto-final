package cl.cparra.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import cl.cparra.modelo.dao.EncomiendaDao;
import cl.cparra.modelo.entity.EncomiendaEntidad;

public class EncomiendaService {

	private static final Logger log = LoggerFactory.getLogger(EncomiendaService.class);

	@Autowired
	EncomiendaDao encomiendaDao;
		
	 @Transactional(readOnly = true)
	 public List<EncomiendaEntidad> getAll(){
	 return encomiendaDao.findAll();
	 }
	 
	 public void insertarDepartamento(EncomiendaEntidad encomienda) {
		encomienda.getProveedor();
		encomienda.getFecha();
		encomienda.getUsuario();
		log.info("Insertado ok" + encomienda);

		}
}
