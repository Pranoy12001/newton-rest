package com.pranoyit.newtonrest.dao;

import com.pranoyit.newtonrest.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long> {
}
