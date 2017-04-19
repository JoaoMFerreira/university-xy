package org.xy.api;

import java.io.Serializable;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.xy.util.BaseEntity;

@RequestMapping(consumes = "application/json", produces = "application/json")
public interface IGenericController<T extends BaseEntity<ID>, ID extends Serializable> {

	@RequestMapping(method = RequestMethod.GET)
	List<T> findAll();

	@RequestMapping(method = RequestMethod.POST)
	T insert(T entityObject);

	@RequestMapping(method = RequestMethod.PUT)
	void update(T entityObject);

	@RequestMapping(method = RequestMethod.DELETE)
	void delete(T entityObject);

}
