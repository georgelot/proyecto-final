package cl.cparra.modelo.entity;

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
public class UsuarioEntidad {
	
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
	 	
	 	
	 	
	 	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario", orphanRemoval = true)
	 	List<DepartamentoEntidad> departamento = new ArrayList<>();
	 	
	 	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario", orphanRemoval = true)
	 	List<EncomiendaEntidad> encomienda = new ArrayList<>();
	 	
	 	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario", orphanRemoval = true)
	 	List<EventoEntidad> evento = new ArrayList<>();
	 	
	 	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario", orphanRemoval = true)
	 	List<VisitaEntidad> visitas = new ArrayList<>();
	 	
	 	
	 	public UsuarioEntidad agregarDepartamento (DepartamentoEntidad departamentoIn) {
	 			this.departamento.add(departamentoIn);
	 			return this;
	 			}
		
		public UsuarioEntidad agregarReserva (EventoEntidad eventoIn) {
		 		this.evento.add(eventoIn);
				return this;
				}
				
		public UsuarioEntidad agregarEncomienda (EncomiendaEntidad encomiendaIn) {
				this.encomienda.add(encomiendaIn);
				return this;
				}
		
		public UsuarioEntidad agregarVisita (VisitaEntidad visitaIn) {
				this.visitas.add(visitaIn);
				return this;
			}
		
	 	}

