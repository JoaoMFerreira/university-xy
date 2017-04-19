package org.xy.util;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.xy.api.IGenericController;
import org.xy.api.IGenericService;

public abstract class GenericController<T extends BaseEntity<ID>, ID extends Serializable> implements IGenericController<T, ID>{

	private final Logger LOGGER = Logger.getLogger(this.getClass());

	@Autowired
	protected IGenericService<T, ID> genericService;

	@Override
	public List<T> findAll() {
		if (this.LOGGER.isDebugEnabled()) {
			this.LOGGER.debug("Requesting all records.");
		}

		return this.genericService.findAll();
	}
	@Override
	public T insert(@RequestBody T entityObject) {
		if (this.LOGGER.isDebugEnabled()) {
			this.LOGGER.debug(String.format("Saving the entity [%s].", entityObject));
		}

		return this.genericService.insert(entityObject);
	}
	@Override
	public void update(@RequestBody T entityObject) {
		this.LOGGER.debug(String.format("Request to update the record [%s].", entityObject));

		if (entityObject.getId() == null) {
			String errorMessage = String.format("ID of entity [%s] cannot be null.", entityObject.getClass());
			this.LOGGER.error(errorMessage);
//			throw new ServerException(errorMessage);
		}

		this.genericService.insert(entityObject);
	}
	@Override
	public void delete(@RequestBody T entityObject) {
		this.LOGGER.debug(String.format("Request to delete the record [%s].", entityObject));

		this.genericService.delete(entityObject);
	}

}
