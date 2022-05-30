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
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(");
        stringBuffer.append(getX());
        stringBuffer.append(",");
        stringBuffer.append(getY());
        stringBuffer.append(")");
        stringBuffer.append("의 점");
        return stringBuffer.toString();
    }
}
