package com.Practice4;

public class Rect implements Shape{
    private int width;
    private int height;
    public Rect(int width,int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw() {
        System.out.println("%dX%d크기의 사각형 입니다.");
    }

    @Override
    public double getArea() {
        return width*height; // 자동 캐스팅
    }
}
