package org.xy.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xy.api.ICourseController;
import org.xy.entities.CourseEntity;
import org.xy.util.GenericController;

@RestController
@RequestMapping("/curso")
public class CourseController extends GenericController<CourseEntity, Long>implements ICourseController{

}
