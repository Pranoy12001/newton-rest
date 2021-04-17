package com.pranoyit.newtonrest.entity;

public class Course {
    private long courseId;
    private String courseTitle;
    private String description;

    public Course() {
    }

    public Course(long courseId, String courseTitle, String description) {
        this.courseId = courseId;
        this.courseTitle = courseTitle;
        this.description = description;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseTitle='" + courseTitle + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
