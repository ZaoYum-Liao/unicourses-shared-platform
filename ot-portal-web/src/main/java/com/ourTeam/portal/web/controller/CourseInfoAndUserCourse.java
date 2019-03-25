package com.ourTeam.portal.web.controller;

import java.io.Serializable;

public class CourseInfoAndUserCourse implements Serializable {

    private String courName;
    private String courInfo;
    private Integer courStar;
    private String courComment;
    private Integer courId;

    public String getCourName() {
        return courName;
    }

    public String getCourInfo() {
        return courInfo;
    }

    public Integer getCourStar() {
        return courStar;
    }

    public String getCourComment() {
        return courComment;
    }

    public Integer getCourId() {
        return courId;
    }

    public void setCourName(String courName) {
        this.courName = courName;
    }

    public void setCourInfo(String courInfo) {
        this.courInfo = courInfo;
    }

    public void setCourStar(Integer courStar) {
        this.courStar = courStar;
    }

    public void setCourComment(String courComment) {
        this.courComment = courComment;
    }

    public void setCourId(Integer courId) {
        this.courId = courId;
    }
}
