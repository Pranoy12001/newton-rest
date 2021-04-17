package com.pranoyit.newtonrest.service;

import com.pranoyit.newtonrest.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {
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

    @Override
    public Course updateCourse(Course course) {
        courses.forEach(c -> {
            if (c.getCourseId() == course.getCourseId()) {
                c.setCourseTitle(course.getCourseTitle());
                c.setDescription(course.getDescription());
            }
        });
        return course;
    }

    @Override
    public void deleteCourse(long courseId) {
        courses = courses.stream().filter(c -> c.getCourseId() != courseId).collect(Collectors.toList());
    }
}
