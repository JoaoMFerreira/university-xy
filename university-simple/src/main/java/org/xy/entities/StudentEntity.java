package org.xy.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.xy.util.BaseEntity;

/**
 * 
 * @author JoãoMarcos
 *
 */
@Entity
@Table(name = "TBL_ALUNO")
public class StudentEntity extends BaseEntity<StudentKey> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3193322243951362737L;
	
	@NotNull
	@Column(name = "NOME", length = 60, nullable = false)
	private String nome;
	
	@NotNull
	@Column(name = "CURSO_ID", length = 11, nullable = false)
	private Long cursoId;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCursoId() {
		return cursoId;
	}

	public void setCursoId(Long cursoId) {
		this.cursoId = cursoId;
	}

}
