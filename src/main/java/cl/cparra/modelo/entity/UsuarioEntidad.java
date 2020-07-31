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
	    
	    //ver rol de administrador, empleado y residente
}
