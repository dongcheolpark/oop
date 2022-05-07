package com.company;

import com.company.Class1.Class1;
import com.company.Class2.Class2;
import com.company.Reflection.ReflectionTest;

public class ClassFactory {
    public static ClassInterface Get(Integer num) {
        return switch (num) {
            case 1 -> new Class1();
            case 2 -> new Class2();
            case 3 -> new ReflectionTest();
            default -> null;
        };
    }
}
