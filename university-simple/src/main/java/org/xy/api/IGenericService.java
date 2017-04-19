package org.xy.api;

import java.io.Serializable;
import java.util.List;

import org.xy.util.BaseEntity;

public interface IGenericService <T extends BaseEntity<ID>, ID extends Serializable>{

	List<T> findAll();

	T insert(T entityObject);

	void update(T entityObject);

	void delete(T entityObject);
	
	void delete(ID id);

}
