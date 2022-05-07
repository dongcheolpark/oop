package com.company.Class2;

public class Unit {
    public Integer getHp() {
        return Hp;
    }

    public void setHp(Integer hp) {
        Hp = hp;
    }
    public Unit() {
        test = new Test();
    }

    private Integer Hp;

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    private Test test;
    public static int x = 10;
    public Integer Mp;
}
