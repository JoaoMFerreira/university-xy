package org.xy.services;

import org.springframework.stereotype.Service;
import org.xy.api.ICourseService;
import org.xy.entities.CourseEntity;
import org.xy.util.GenericService;

@Service
public class CourseService extends GenericService<CourseEntity, Long> implements ICourseService{

}
