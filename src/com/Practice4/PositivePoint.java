package com.Practice4;

public class PositivePoint extends Point {

    public PositivePoint(int x, int y) {
        super(x, y);

        if(x<0||y<0) {
            move(0,0);
        }
    }
    public PositivePoint() {
        super(0,0);
    }

    @Override
    protected void move(int x, int y) {
        if(x<0||y<0) return;
        super.move(x, y);
    }

    @Override
    public String toString() {
        return "(" +
                getX() +
                "," +
                getY() +
                ")" +
                "의 점";
    }
}
