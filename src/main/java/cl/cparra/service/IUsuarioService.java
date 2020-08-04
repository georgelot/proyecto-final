package cl.cparra.service;

import java.util.List;

import cl.cparra.modelo.entity.*;
public interface IUsuarioService{

	List<UsuarioEntidad> obtenerTodos();
	void agregar(UsuarioEntidad usuarioEntidad);
	void eliminar(int id);
	void actualizar(UsuarioEntidad usuarioEntidad);
}
