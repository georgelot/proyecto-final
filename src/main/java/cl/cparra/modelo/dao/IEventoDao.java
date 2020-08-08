package cl.cparra.modelo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import cl.cparra.modelo.entity.EventoEntidad;

public interface IEventoDao extends JpaRepository<EventoEntidad, Integer>{

}
