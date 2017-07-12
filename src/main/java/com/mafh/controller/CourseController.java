package com.mafh.controller;

import com.mafh.model.Course;
import com.mafh.service.CourseService;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author mafh
 * @create 2017-07-11 14:02
 * Created With Intellij IDEA
 */
@Controller
@RequestMapping("/courses")
public class CourseController {
    private Logger logger = LoggerFactory.getLogger(CourseController.class);
    @Autowired
    private CourseService courseService;

    /**
     * 本方法将处理/courses/course?courseId=123
     * 基础代码
     * @param courseId
     * @param model
     * @return
     */
    @RequestMapping(value = "/course",method = RequestMethod.GET)
    public String viewCourse(@RequestParam("courseId") Integer courseId, Model model){
        logger.debug("in viewCourse,courseId={}",courseId);
        Course course = courseService.getCourseById(courseId);
        model.addAttribute(course);
        return "course";
    }

    /**
     * 本方法将处理/courses/course2/123
     * 现代方式
     * @param courseId
     * @param model
     * @return
     */
    @RequestMapping(value="/course2/{courseId}",method=RequestMethod.GET)
    public String viewCourse2(@PathVariable("courseId") Integer courseId, Map<String,Object> model){
        logger.info("in viewCourse2,courseId={}",courseId);
        logger.debug("in viewCourse2,courseId={}",courseId);
        Course course = courseService.getCourseById(courseId);
        model.put("course",course);
        return "course";
    }

    /**
     * 本方法将处理/courses/course3?courseId=789
     * 传统方式
     * @param request
     * @return
     */
    @RequestMapping(value="/course3",method=RequestMethod.GET)
    public String viewCourse3(HttpServletRequest request){
        Integer courseId = Integer.valueOf(request.getParameter("courseId"));
        logger.info("in viewCourse3,courseId={}",courseId);
        Course course = courseService.getCourseById(courseId);
        request.setAttribute("course",course);
        return "course";
    }

    /**
     * 请求页面
     * @return
     */
    @RequestMapping(value = "/create",method = RequestMethod.GET,params = "add")
    public String createCourse(){
        return "course_admin/edit";
    }

    /**
     * 保存跳转
     * @ModelAttribute 从form表单中获取对象，实际上，不做此注解也可以拿到对象
     * @param course
     * @return
     */
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String doSave(@ModelAttribute Course course){
        logger.info("info of course");
        logger.info(ReflectionToStringBuilder.toString(course));
        /**
         * 业务操作，比如：
         * 数据库持久化操作
         */
        course.setCourseId(222);
        return "redirect:course2/"+course.getCourseId()+"?"+course.getTitle();
    }
}
