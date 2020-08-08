package cl.cparra.modelo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.cparra.modelo.entity.EncomiendaEntidad;

public interface IEncomiendaDao extends JpaRepository<EncomiendaEntidad, Integer>{

}
