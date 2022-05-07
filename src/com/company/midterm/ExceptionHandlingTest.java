package com.company.midterm;

class ChildException extends Exception {}

public class ExceptionHandlingTest {
    static int count = 0;
    public static void main(String[] args) {
        while(true) {
            try {
                if(count++ == 0) {
                    throw new ChildException();
                }
                System.out.println("CatchMe");
            }
            catch (ChildException e) {
                System.out.println("ChildException");
            }
            finally {
                System.out.println("Finally");
                if(count == 2) break;
            }
        }
    }
}
