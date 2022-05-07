package com.company.Reflection;

public class Person {
    int age;
    public static String str = "testString";
    Person() {
        this.age = 27;
    }
    Person(int age) {
        this.age = age;
    }
    int getAge() {
        return this.age;
    }
    public String getStr() {
        return str;
    }
}
