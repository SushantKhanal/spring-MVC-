package com.spring.controller;

import java.util.Date;
import java.util.List;

public class Student {
    private String studentName;
    private String studentHobby;
    private Long studentMobile;
    private Date studentDOB;
    private List<String> studentSkills;


    public String getStudentName() {
        return studentName;
    }

    public String getStudentHobby() {
        return studentHobby;
    }

    public Long getStudentMobile() { return studentMobile; }

    public Date getStudentDOB() { return studentDOB; }

    public List<String> getStudentSkills() { return studentSkills; }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentHobby(String studentHobby) {
        this.studentHobby = studentHobby;
    }

    public void setStudentMobile(Long studentMobile) { this.studentMobile = studentMobile; }

    public void setStudentDOB(Date studentDOB) { this.studentDOB = studentDOB; }

    public void setStudentSkills(List<String> studentSkills) { this.studentSkills = studentSkills; }
}
