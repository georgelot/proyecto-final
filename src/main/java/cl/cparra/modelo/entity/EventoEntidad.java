package cl.cparra.modelo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private String espacio;//quincho p piscina
	private Integer fecha;
	private Integer horaInicio;
	private Integer horaFin;
	//listar departamentos
	//listar estado, en curso, estado, suspendido
}
