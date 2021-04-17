package com.pranoyit.newtonrest.service;

import com.pranoyit.newtonrest.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);
}
