package com.domain;

public class score_inf {
    private Integer l;
    private String id;
    private String courseId;
    private String score;

    public Integer getL() {
        return l;
    }

    public void setL(Integer l) {
        this.l = l;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "score_inf{" +
                "l=" + l +
                ", id='" + id + '\'' +
                ", courseId='" + courseId + '\'' +
                ", score='" + score + '\'' +
                '}';
    }
}
