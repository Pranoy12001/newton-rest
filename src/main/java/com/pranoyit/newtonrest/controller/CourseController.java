package com.pranoyit.newtonrest.controller;

import com.pranoyit.newtonrest.entity.Course;
import com.pranoyit.newtonrest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    private CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    /**
     * this controller is used to get all courses
     *
     * @return all course {@link List}
     */
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();
    }

    /**
     * this controller is used to get single course by course id
     *
     * @param courseId
     * @return single course {@link Course}
     */
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return this.courseService.getCourse(Long.parseLong(courseId));
    }

    /**
     * this controller is used to save course
     * @param course
     * @return saved course {@link Course}
     */
    @PostMapping("courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }
}
