package com.company.Reflection;

import com.company.ClassInterface;

public class ReflectionTest implements ClassInterface {
    public void _main(String[] args) {
        Person person = new Person();
        System.out.println(person.getStr());
        Person.str = "hello,world!";
        System.out.println(person.getStr());
    }
}
