package com.company.Class2;

import com.company.ClassInterface;

public class Class2 implements ClassInterface {

    public void _main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);
        a = 2000;
        b = 2000;
        System.out.println(a == b);
    }
}
