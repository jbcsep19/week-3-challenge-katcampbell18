package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ResumeApp {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Education> education = new ArrayList<Education>();
        ArrayList<Job> job = new ArrayList<Job>();
        ArrayList<Skill> skill = new ArrayList<Skill>();
        String answer;

        // Prompts for user info
        System.out.println();
        System.out.println("Please enter your full name");
        String name = sc.nextLine();
        System.out.println("Please enter your email address");
        String email = sc.nextLine();

        // prompt for user education
        do {
            System.out.println("Please enter your education, most recent first");
            System.out.println("Enter the degree type (Associate's, Bachelor's, Master's, PhD, etc");
            String degree = sc.nextLine();
            System.out.println("Enter the major");
            String major = sc.nextLine();
            System.out.println("Enter the name of the school");
            String school = sc.nextLine();
            System.out.println("Enter the year graduated or the expected graduation year");
            String gradYear = sc.nextLine();
            Education e = new Education(degree, major, school, gradYear);
            education.add(e);
            System.out.println("Enter 'C' to add more education or 'q' to add work experience");
            answer = sc.nextLine();
        }
        while(!answer.equalsIgnoreCase("q"));

        // prompt for user work experience
        do{
            System.out.println("Please enter your work experience, most recent first");
            System.out.println("Enter the company name");
            String company = sc.nextLine();
            System.out.println("Enter the job title");
            String title = sc.nextLine();
            System.out.println("Enter the start date (mm/YYYY)");
            String startDate = sc.nextLine();
            System.out.println("Enter the end date (mm/YYYY)");
            String endDate = sc.nextLine();
            System.out.println("Enter the job description");
            String description = sc.nextLine();
            Job j = new Job(company, title, startDate, endDate, description);
            job.add(j);
            System.out.println("Enter 'C' to add more work experience or 'q' to add job skills");
            answer = sc.nextLine();
        }
        while(!answer.equalsIgnoreCase("q"));

        // prompt for user skills
        do{
            System.out.println("Please enter at least three job skills");
            System.out.println("Skill: ");
            String skillName = sc.nextLine();
            System.out.println("How do you rate this skill: Fundamental, Novice, Intermediate, Advanced, or Expert");
            String rating = sc.nextLine();
            Skill s = new Skill(skillName, rating);
            skill.add(s);
            System.out.println("Enter 'C' to add more work experience or 'q' to Quit");
            answer = sc.nextLine();
        }
        while(!answer.equalsIgnoreCase("q"));
        System.out.println("Your resume is now complete.");

        Person p = new Person(name, email, education, job, skill);

        System.out.println();
        System.out.println("================================================================");
        System.out.println(p.getName());
        System.out.println(p.getEmail());
        System.out.println();
        System.out.println("Education");
        for(Education e : p.getEducation()){
            System.out.println(e.getDegree() + " in " + e.getMajor() + ", \n" + e.getSchool() + ", " + e.getGradYear());
        }
        System.out.println();
        System.out.println("Experience");
        for(Job j : p.getJob()){
            System.out.println(j.getTitle() +"\n" + j.getCompany() + ", " + j.getStartDate() + " - " + j.getEndDate() + "\n"
                    + "- Duty, " + j.getDescription());
        }
        System.out.println();
        System.out.println("Skills");
        for(Skill s : p.getSkill()){
            System.out.println(s.getSkillName() + ", " + s.getRating());
        }
    }
}
