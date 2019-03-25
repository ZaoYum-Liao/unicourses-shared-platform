package com.ourTeam.manager.pojo;

import java.io.Serializable;

public class UserCourse implements Serializable {
    private Integer id;

    private Integer courId;

    private Integer userId;

    private String courName;

    private String userName;

    private String courComment;

    private Integer courStar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCourId() {
        return courId;
    }

    public void setCourId(Integer courId) {
        this.courId = courId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getCourName() {
        return courName;
    }

    public void setCourName(String courName) {
        this.courName = courName == null ? null : courName.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getCourComment() {
        return courComment;
    }

    public void setCourComment(String courComment) {
        this.courComment = courComment == null ? null : courComment.trim();
    }

    public Integer getCourStar() {
        return courStar;
    }

    public void setCourStar(Integer courStar) {
        this.courStar = courStar;
    }
}