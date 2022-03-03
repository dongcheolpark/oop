package com.company;

import com.company.Class1.Class1;

public class ClassFactory {
    public static ClassInterface Get(Integer num) {
        switch (num) {
            case 1:
                return new Class1();
            default:
                return null;
        }
    }
}
