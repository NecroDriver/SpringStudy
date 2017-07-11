package com.mafh.controller;

import com.mafh.model.Course;
import com.mafh.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author mafh
 * @create 2017-07-11 14:02
 * Created With Intellij IDEA
 */
@Controller
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping(value = "/course",method = RequestMethod.GET)
    public String getCourseById(@RequestParam("courseId") Integer courseId, Model model){
        Course course = courseService.getCourseById(courseId);
        model.addAttribute(course);
        return "course";
    }
}
