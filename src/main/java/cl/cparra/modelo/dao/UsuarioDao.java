package cl.cparra.modelo.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.cparra.modelo.entity.UsuarioEntidad;

public interface UsuarioDao extends JpaRepository<UsuarioEntidad, Integer>{
	
	Optional<UsuarioEntidad> findByCorreo(String correo);

}
