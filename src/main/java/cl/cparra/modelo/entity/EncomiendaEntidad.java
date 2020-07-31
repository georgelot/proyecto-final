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
@Table(name = "encomiendas")
public class EncomiendaEntidad {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String proveedor;
	private Integer fecha;
	private boolean estado;//entregado o en recepcion
	//listar departamentos
}
