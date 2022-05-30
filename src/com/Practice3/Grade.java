package com.Practice3;

public class Grade {
    private int math;
    private int science;
    private int english;


    Grade(int math,int science,int english) {
        this.math = math;
        this.science = science;
        this.english = english;
    }

    public double average() {
        return (double)(math+science+english)/3;
    }

}
