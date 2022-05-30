package com.Practice4;

public class Circle implements Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.printf("반지름이 %d인 원입니다.",radius);
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }
}
