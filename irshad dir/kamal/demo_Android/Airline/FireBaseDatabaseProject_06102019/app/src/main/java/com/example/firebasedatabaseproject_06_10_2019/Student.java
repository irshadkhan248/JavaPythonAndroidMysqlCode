package com.example.firebasedatabaseproject_06_10_2019;

public class Student {
    private  int rno;
    private  String name;

    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                '}';
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student() {
    }

    public Student(int rno, String name) {
        this.rno = rno;
        this.name = name;
    }
}
