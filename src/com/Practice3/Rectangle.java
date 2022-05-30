package com.Practice3;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;
    private int area;

    public Rectangle(int x,int y,int width,int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        area = width * height;
    }

    public void show() {
        System.out.println("("+x+","+y+")에서 크기가 "+width+"x"+height+"인 사각형");
    }

    public int square() {
        return area;
    }

    public boolean contains(Rectangle r) {
        return (x < r.x && y < r.y && x+width > r.x + r.width && y + height > r.y + r.height);
    }
}
