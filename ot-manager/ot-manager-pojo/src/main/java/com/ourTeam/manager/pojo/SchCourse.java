package com.ourTeam.manager.pojo;

import java.io.Serializable;

public class SchCourse  implements Serializable {
    private String courCode;

    private String schName;

    private String courName;

    public String getCourCode() {
        return courCode;
    }

    public void setCourCode(String courCode) {
        this.courCode = courCode == null ? null : courCode.trim();
    }

    public String getSchName() {
        return schName;
    }

    public void setSchName(String schName) {
        this.schName = schName == null ? null : schName.trim();
    }

    public String getCourName() {
        return courName;
    }

    public void setCourName(String courName) {
        this.courName = courName == null ? null : courName.trim();
    }
}