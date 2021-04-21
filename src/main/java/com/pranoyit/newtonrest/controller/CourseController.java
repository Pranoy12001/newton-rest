package com.pranoyit.newtonrest.controller;

import com.pranoyit.newtonrest.entity.Course;
import com.pranoyit.newtonrest.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
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
     *
     * @param course
     * @return saved course {@link Course}
     */
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }

    /**
     * this controller is used to update course
     *
     * @param course
     * @return updated course {@link Course}
     */
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    /**
     * this controller is used to delete course
     *
     * @param courseId
     * @retur responseEntity {@link ResponseEntity}
     */
    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId) {
        try {
            this.courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception ex) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
