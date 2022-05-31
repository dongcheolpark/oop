package com.Practice4;

public class Oval implements Shape {
    private int longRadius;
    private int shortRadius;

    public Oval(int shortRadius,int longRadius) {
        if(longRadius < shortRadius) {
            int tmp = longRadius;
            longRadius = shortRadius;
            shortRadius = tmp;
        }
        this.shortRadius = shortRadius;
        this.longRadius = longRadius;
    }
    @Override
    public void draw() {
        System.out.printf("%dX%d에 내접하는 타원입니다.\n",shortRadius,longRadius);
    }

    @Override
    public double getArea() {
        return PI * shortRadius * longRadius;
    }
}
