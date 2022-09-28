package com.domain;

public class course_teacher {
    private String courseId;
    private String course;
    private String teacher;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "course_teacher{" +
                "courseId='" + courseId + '\'' +
                ", course='" + course + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
