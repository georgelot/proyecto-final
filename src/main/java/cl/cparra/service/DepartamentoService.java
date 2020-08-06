package cl.cparra.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import cl.cparra.modelo.dao.DepartamentoDao;
import cl.cparra.modelo.entity.DepartamentoEntidad;

public class DepartamentoService {
	private static final Logger log = LoggerFactory.getLogger(DepartamentoService.class);

	@Autowired
	DepartamentoDao departamentoDao;
		
	 @Transactional(readOnly = true)
	 public List<DepartamentoEntidad> getAll(){
	 return departamentoDao.findAll();
	 }
	 
	 public void insertarDepartamento(DepartamentoEntidad departamento) {
			departamento.getNumero();
			log.info("Insertado ok" + departamento);

	}
}
