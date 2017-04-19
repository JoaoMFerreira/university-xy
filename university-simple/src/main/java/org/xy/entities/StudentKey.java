package org.xy.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.xy.util.BaseKey;
/**
 * Classe para representar a chave composta de Estudante na tabela
 * 
 * @author JoãoMarcos
 *
 */
@Embeddable
public class StudentKey extends BaseKey {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5466383377558793449L;

	@Column(name = "CPF", length = 11, nullable = false)
	private Long cpf;

	@Column(name = "MATRICULA", length = 20, nullable = false)
	private String matricula;

	public StudentKey() {
 
	}
	
	public StudentKey(Long cpf, String matricula) {
		super();
		this.cpf = cpf;
		this.matricula = matricula;
	}



	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

}
