package org.xy.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.xy.entities.StudentEntity;
import org.xy.entities.StudentKey;

public interface IStudentController extends IGenericController<StudentEntity,StudentKey>{

	@RequestMapping(value = "/{cpf}/{matricula}", method = RequestMethod.DELETE)
	void delete(Long id, String matricula);

}
