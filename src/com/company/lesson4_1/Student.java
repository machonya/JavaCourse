package com.company.lesson4_1;

public class Student extends Person{

    private int course = 1;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String name, int age, int height, int weight, int course) {
        super(name, age, height, weight);
        this.course = course;
    }
    public int intelligence() {
        int intel = course * 10;
        return intel;
    }

}
