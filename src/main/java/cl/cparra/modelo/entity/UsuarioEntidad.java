package cl.cparra.modelo.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name = "usuario")
public class UsuarioEntidad implements Serializable {
	private static final long serialVersionUID = 2783793452079995917L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nombre;
	private String apellido;
	private String rut;
	private String telefono;
	private String correo;
	private String contrasenia;
	private Role rol;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "numero", orphanRemoval = true)
	List<DepartamentoEntidad> departamentos = new ArrayList<>();

	// helpers
	public UsuarioEntidad agregarDepartamento(DepartamentoEntidad departamentoIn) {
		departamentoIn.setUsuario(this);
		this.departamentos.add(departamentoIn);
		return this;
	}

	public UsuarioEntidad eliminarDepartamento(DepartamentoEntidad departamentoIn) {
		departamentoIn.setUsuario(null);
		this.departamentos.remove(departamentoIn);
		return this;
	}

	public UsuarioEntidad eliminarDepartamentos() {
		for (DepartamentoEntidad departamento : departamentos)
			departamento.setUsuario(null);

		this.departamentos = null;
		return this;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "espacio", orphanRemoval = true)
	List<EventoEntidad> evento = new ArrayList<>();

	public UsuarioEntidad agregarReserva(EventoEntidad eventoIn) {
		eventoIn.setUsuario(this);
		this.evento.add(eventoIn);
		return this;
	}
	
	public UsuarioEntidad eliminarReserva(EventoEntidad eventoIn) {
		eventoIn.setUsuario(null);
		this.evento.remove(eventoIn);
		return this;
	}
	
	public UsuarioEntidad eliminarReservas() {
		for (EventoEntidad evento : evento)
			evento.setUsuario(null);

		this.evento = null;
		return this;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "nombre", orphanRemoval = true)
	List<VisitaEntidad> visitas = new ArrayList<>();
	
	public UsuarioEntidad agregarVisita(VisitaEntidad visitaIn) {
		visitaIn.setUsuario(this);
		this.visitas.add(visitaIn);
		return this;
	}
	
	public UsuarioEntidad eliminarVisita(VisitaEntidad visitaIn) {
		visitaIn.setUsuario(null);
		this.visitas.remove(visitaIn);
		return this;
	}
	
	public UsuarioEntidad eliminarVisitas() {
		for (VisitaEntidad visita : visitas)
			visita.setUsuario(null);

		this.visitas = null;
		return this;
	}

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "proveedor", orphanRemoval = true)
	List<EncomiendaEntidad> encomienda = new ArrayList<>();
	
	public UsuarioEntidad agregarEncomienda(EncomiendaEntidad encomiendaIn) {
		encomiendaIn.setUsuario(this);
		this.encomienda.add(encomiendaIn);
		return this;
	}
	
	public UsuarioEntidad eliminarEncomienda(EncomiendaEntidad encomiendaIn) {
		encomiendaIn.setUsuario(null);
		this.encomienda.remove(encomiendaIn);
		return this;
	}
	
	public UsuarioEntidad eliminarEncomiendas() {
		for (EncomiendaEntidad encomiendas : encomienda)
			encomiendas.setUsuario(null);

		this.encomienda = null;
		return this;
	}
}
