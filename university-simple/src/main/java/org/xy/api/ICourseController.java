package org.xy.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.xy.entities.CourseEntity;

public interface ICourseController extends IGenericController<CourseEntity, Long> {

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	void delete(Long id);
	
}
