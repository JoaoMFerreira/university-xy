package org.xy.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.xy.util.BaseEntity;

/**
 * Classe de representacao da entidade Curso.
 * 
 * @author JoãoMarcos
 *
 */
@Entity
@Table(name = "TBL_CURSO")
public class CourseEntity extends BaseEntity<Long> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3977692210399354075L;
	
	@Column(name = "NOME", length = 60,nullable = false)
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
