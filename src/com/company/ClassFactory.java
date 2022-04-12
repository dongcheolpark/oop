package com.company;

import com.company.Class1.Class1;
import com.company.Class2.Class2;

public class ClassFactory {
    public static ClassInterface Get(Integer num) {
        switch (num) {
            case 1:
                return new Class1();
            case 2:
                return new Class2();
            default:
                return null;
        }
    }
}
