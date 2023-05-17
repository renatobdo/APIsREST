package br.com.ifsp.cafeteria.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "cafe")
@Entity(name = "Cafe")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cafe{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message = "O ID não pode ser nulo")
	private Long id;	
	@NotBlank(message = "O nome não pode estar em branco")
	private String name;	
	private String historia;
	private String sabor;
	private String referencia;
	private String imagem;
	
	public void setName(String name) {
		this.name = name;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}


	public void setId(Long id2) {
		this.id = id2;		
	}

}
