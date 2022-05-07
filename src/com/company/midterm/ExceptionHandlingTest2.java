package com.company.midterm;

class GrandChildException extends ChildException {}

public class ExceptionHandlingTest2 {
    public static void main(String[] main) {
        try {
            throw new GrandChildException();
        }
        catch (GrandChildException g) {
            System.out.println("GrandChildException");
        }
        catch (ChildException c) {
            System.out.println("ChildException");
        }

        int arr[] = new int[10];

        try {
            throw new GrandChildException();
        }
        catch (ChildException c) {
            System.out.println("ChildException");
        }
    }
}
