package com.company;

import java.util.ArrayList;

public class Person {
    private String name;
    private String email;
    private ArrayList<Education> education;
    private ArrayList<Job> job;
    private ArrayList<Skill> skill;

    public Person() {
        this.education = new ArrayList<Education> ();
        this.job = new ArrayList<Job>();
        this.skill = new ArrayList<Skill>();

    }

    public Person(String name, String email, ArrayList<Education> edu, ArrayList<Job> j, ArrayList<Skill> s) {
        this.name = name;
        this.email = email;
        this.education = edu;
        this.job = j;
        this.skill = s;
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

    public ArrayList<Job> getJob() {
        return job;
    }

    public void setJob(ArrayList<Job> job) {
        this.job = job;
    }

    public ArrayList<Skill> getSkill() {
        return skill;
    }

    public void setSkills(ArrayList<Skill> skill) {
        this.skill = skill;
    }
}
