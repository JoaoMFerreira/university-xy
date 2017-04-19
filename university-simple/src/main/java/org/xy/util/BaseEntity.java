package org.xy.util;

import java.io.Serializable;

import javax.persistence.Id;

import org.springframework.data.jpa.domain.AbstractPersistable;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe Base para definicao de ID generico
 * 
 * @author JoãoMarcos
 *
 * @param <ID>
 *            Classe genérica deve obrigatoriamente extender de Serializable
 */
public class BaseEntity<ID extends Serializable> extends AbstractPersistable<ID> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7714437114181345177L;

	@Id
	private ID id;

	@Override
	public ID getId() {
		return id;
	}

	@Override
	public void setId(ID id) {
		this.id = id;
	}
	
	@Override
	@JsonIgnore
	public boolean isNew() {
		return null == this.getId();
	}


}
