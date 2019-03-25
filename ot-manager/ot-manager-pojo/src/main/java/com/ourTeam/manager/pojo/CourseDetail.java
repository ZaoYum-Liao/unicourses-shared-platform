package com.ourTeam.manager.pojo;

import java.io.Serializable;

public class CourseDetail implements Serializable {
    private String courCode;

    private String courDetail;

    private String courImage;

    public String getCourCode() {
        return courCode;
    }

    public void setCourCode(String courCode) {
        this.courCode = courCode == null ? null : courCode.trim();
    }

    public String getCourDetail() {
        return courDetail;
    }

    public void setCourDetail(String courDetail) {
        this.courDetail = courDetail == null ? null : courDetail.trim();
    }

    public String getCourImage() {
        return courImage;
    }

    public void setCourImage(String courImage) {
        this.courImage = courImage == null ? null : courImage.trim();
    }
}