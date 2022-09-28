package com.domain;

public class Class_inf {
    private String id;
    private String name;
    private String majorclass;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajorclass() {
        return majorclass;
    }

    public void setMajorclass(String majorclass) {
        this.majorclass = majorclass;
    }

    @Override
    public String toString() {
        return "Class_inf{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", majorclass='" + majorclass + '\'' +
                '}';
    }
}
