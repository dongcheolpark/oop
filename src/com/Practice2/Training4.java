package com.Practice2;

import java.util.Scanner;

public class Training4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String str = scanner.next();
        char ch = str.charAt(0);
        while(true) {
            for(char i = 'a';i<=ch;i++) {
                System.out.print(i);
            }
            ch--;
            if(ch<'a') break;
            System.out.println();
        }
    }
}
