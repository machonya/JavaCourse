package com.company.adaptation.personForAdaptation;

public class Student extends Person{
    private int course = 1;

    public Student(String name, int age, int height, double weight, int hp) {
        super(name, age, height, weight, hp);
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    public int growthOfIntelligence() {
        int intel = course * 10;
        return intel;

    }
}
