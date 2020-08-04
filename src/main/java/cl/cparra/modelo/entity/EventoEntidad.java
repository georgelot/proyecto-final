package cl.cparra.modelo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
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
@Table(name = "evento")
public class EventoEntidad {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String espacio;
	private Integer fecha;
	private Integer horaInicio;
	private Integer horaFin;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@MapsId("usuario_id")
	@JoinColumn(name = "usuario_id")
	List<UsuarioEntidad> usuario;
		
}
