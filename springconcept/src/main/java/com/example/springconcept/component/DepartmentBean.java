package com.example.springconcept.component;

import org.springframework.stereotype.Component;

@Component
public class DepartmentBean {
    private String deptName;

    public DepartmentBean() {
        this.deptName="Management";
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName=deptName;
    }
}