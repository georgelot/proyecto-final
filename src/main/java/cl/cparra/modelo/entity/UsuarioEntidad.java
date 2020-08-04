package cl.cparra.modelo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
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
	 	
	 	@OneToMany
	 	@MapsId("departamento_id")
		@JoinColumn(name = "departamento_id")
	 	List<DepartamentoEntidad> departamento;
	 	
	 	@OneToMany
	 	@MapsId("encomienda_id")
		@JoinColumn(name = "encomienda_id")
	 	List<EncomiendaEntidad> encomienda;
	 	
	 	@ManyToMany
	 	@MapsId("evento_id")
		@JoinColumn(name = "evento_id")
	 	List<EventoEntidad> evento;
	 	
	 	@OneToMany
	 	@MapsId("visitas_id")
		@JoinColumn(name = "visitas_id")
	 	List<VisitaEntidad> visitas;
	 	

	 	
	 	
}
