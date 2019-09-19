package com.company;

import java.util.ArrayList;

public class Person {
    private String name;
    private String email;
    private ArrayList<Education> education;
    private ArrayList<Job> job;
    private ArrayList<Skills> skills;

    public Person() {
    }

    public Person(String name, String email, ArrayList<Education> education, ArrayList<Job> job, ArrayList<Skills> skills) {
        this.name = name;
        this.email = email;
        this.education = education;
        this.job = job;
        this.skills = skills;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Education> getEducation() {
        return education;
    }

    public void setEducation(ArrayList<Education> education) {
        this.education = education;
    }

    public void setJob(ArrayList<Job> job) {
        this.job = job;
    }

    public void setSkills(ArrayList<Skills> skills) {
        this.skills = skills;
    }


}
