package cl.cparra.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import cl.cparra.modelo.dao.VisitaDao;
import cl.cparra.modelo.entity.VisitaEntidad;

public class VisitaService {
	private static final Logger log = LoggerFactory.getLogger(VisitaService.class);

	@Autowired
	VisitaDao visitaDao;
		
	 @Transactional(readOnly = true)
	 public List<VisitaEntidad> getAll(){
	 return visitaDao.findAll();
	 }
	 
	 public void insertarVisita(VisitaEntidad visita) {
			visita.getNombre();
			visita.getApellido();
			visita.getDapartamento();
			visita.getFecha();
			visita.getHoraIngreso();
			visita.getHoraSalida();
			log.info("Insertado ok" + visita);

	}
}
