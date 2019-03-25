package com.ourTeam.manager.pojo;

import java.io.Serializable;

public class CourseInfo implements Serializable {
    private Long id;

    private String schName;

    private String courCode;

    private String courName;

    private String courInfo;

    private Integer courSelectnum;

    private Integer courTotalnum;

    private String courRemark;

    private String courIntro;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName == null ? null : schName.trim();
    }

    public String getCourCode() {
        return courCode;
    }

    public void setCourCode(String courCode) {
        this.courCode = courCode == null ? null : courCode.trim();
    }

    public String getCourName() {
        return courName;
    }

    public void setCourName(String courName) {
        this.courName = courName == null ? null : courName.trim();
    }

    public String getCourInfo () { return courInfo; }

    public void setCourInfo(String courDetail) {
        this.courInfo = courDetail == null ? null : courDetail.trim();
    }

    public Integer getCourSelectnum() {
        return courSelectnum;
    }

    public void setCourSelectnum(Integer courSelectnum) {
        this.courSelectnum = courSelectnum;
    }

    public Integer getCourTotalnum() {
        return courTotalnum;
    }

    public void setCourTotalnum(Integer courTotalnum) {
        this.courTotalnum = courTotalnum;
    }

    public String getCourRemark() {
        return courRemark;
    }

    public void setCourRemark(String courRemark) {
        this.courRemark = courRemark == null ? null : courRemark.trim();
    }

    public String getCourIntro() {
       return courIntro;
    }

    public void setCourIntro(String courIntro) {
        this.courIntro = courIntro == null ? null : courIntro.trim();
    }
}