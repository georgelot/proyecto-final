package cl.cparra.modelo.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UsuarioDto {
	
	private Integer id;
 	private String nombre;
 	private String apellido;
 	private String rut;
 	private String telefono;
 	private String correo;
 	private String contrasenia;

}
