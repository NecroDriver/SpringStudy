package com.mafh.service;

import com.mafh.model.Course;
import org.springframework.stereotype.Service;

/**
 * @author mafh
 * @create 2017-07-11 13:57
 * Created With Intellij IDEA
 */
@Service
public interface CourseService {
    Course getCourseById(Integer courseId);
}
