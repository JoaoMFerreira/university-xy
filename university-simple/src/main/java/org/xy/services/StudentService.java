package org.xy.services;

import org.springframework.stereotype.Service;
import org.xy.api.IStudentService;
import org.xy.entities.StudentEntity;
import org.xy.entities.StudentKey;
import org.xy.util.GenericService;

@Service
public class StudentService extends GenericService<StudentEntity, StudentKey> implements IStudentService{

}
