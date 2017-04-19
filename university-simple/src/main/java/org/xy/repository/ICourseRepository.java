package org.xy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xy.entities.CourseEntity;

public interface ICourseRepository extends JpaRepository<CourseEntity, Long>{

}
