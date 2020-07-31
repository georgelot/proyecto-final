package cl.cparra.modelo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.cparra.modelo.entity.DepartamentoEntidad;

public interface DepartamentoDao extends JpaRepository<DepartamentoEntidad, Integer>{
	
}
