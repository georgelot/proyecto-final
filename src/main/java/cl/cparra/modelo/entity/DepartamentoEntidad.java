package cl.cparra.modelo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "departamento")
public class DepartamentoEntidad implements Serializable{
	private static final long serialVersionUID = 7449500244255683085L;
	
		@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;
		private Integer numero;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "usuario_id")
		private UsuarioEntidad usuario;
}