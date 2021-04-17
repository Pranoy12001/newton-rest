package com.pranoyit.newtonrest.service;

import com.pranoyit.newtonrest.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{
    List<Course> courses;

    public CourseServiceImpl() {
        courses = new ArrayList<>();
        courses.add(new Course(1, "Java Core", "Java core related tutorials"));
        courses.add(new Course(2, "Spring Boot", "Spring Boot related tutorials"));
    }

    @Override
    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public Course getCourse(long courseId) {
        Course course = null;

        for (Course c : courses) {
            if (c.getCourseId() == courseId) {
                course = c;
                break;
            }
        }
        return course;
    }

    @Override
    public Course addCourse(Course course) {
        courses.add(course);
        return course;
    }
}
