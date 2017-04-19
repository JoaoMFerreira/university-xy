package org.xy.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xy.api.IStudentController;
import org.xy.entities.StudentEntity;
import org.xy.entities.StudentKey;
import org.xy.util.GenericController;

@RestController
@RequestMapping("/aluno")
public class StudentController extends GenericController<StudentEntity, StudentKey> implements IStudentController{

}
