package cl.cparra.modelo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.cparra.modelo.entity.VisitaEntidad;

public interface IVisitaDao extends JpaRepository<VisitaEntidad, Integer>{

}
