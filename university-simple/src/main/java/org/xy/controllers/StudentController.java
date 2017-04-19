package org.xy.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xy.api.IStudentController;
import org.xy.entities.StudentEntity;
import org.xy.entities.StudentKey;
import org.xy.util.GenericController;

@RestController
@RequestMapping("/aluno")
public class StudentController extends GenericController<StudentEntity, StudentKey> implements IStudentController{
	
	@Override
	public void delete(@PathVariable Long cpf, @PathVariable String matricula ) {
		
		if(cpf != null && matricula != null){			
			this.genericService.delete(new StudentKey(cpf, matricula));
		}
	}
}
