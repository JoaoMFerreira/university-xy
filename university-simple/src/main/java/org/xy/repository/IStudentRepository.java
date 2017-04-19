package org.xy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xy.entities.StudentEntity;
import org.xy.entities.StudentKey;

public interface IStudentRepository extends JpaRepository<StudentEntity, StudentKey>{

}
