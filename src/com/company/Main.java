package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        ClassInterface _class = ClassFactory.Get(Integer.parseInt(args[0]));
        Objects.requireNonNull(_class)._main(args);
    }
}
