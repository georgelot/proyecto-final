package cl.cparra.modelo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "visitas")
public class VisitaEntidad {
	
 	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nombre;
    private String apellido;
    private Integer dapartamento;
    private Integer fecha;
    private Integer horaIngreso;
    private Integer horaSalida;
    
    @ManyToOne(fetch = FetchType.EAGER)
	@MapsId("usuario_id")
	@JoinColumn(name = "usuario_id")
	private UsuarioEntidad usuario;
}

