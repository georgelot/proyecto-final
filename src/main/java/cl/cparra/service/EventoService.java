package cl.cparra.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import cl.cparra.modelo.dao.EventoDao;
import cl.cparra.modelo.entity.EventoEntidad;

public class EventoService {
	private static final Logger log = LoggerFactory.getLogger(EventoService.class);

	@Autowired
	EventoDao eventoDao;
		
	 @Transactional(readOnly = true)
	 public List<EventoEntidad> getAll(){
	 return eventoDao.findAll();
	 }
	 
	 public void insertarDepartamento(EventoEntidad evento) {
		evento.getEspacio();
		evento.getFecha();
		evento.getHoraInicio();
		evento.getHoraFin();
		log.info("Insertado ok" + evento);

		}
}

