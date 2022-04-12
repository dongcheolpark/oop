package com.Practice1;

import java.util.Scanner;

public class Training12_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("연산>>");
        int a,b;
        char op;
        a = scanner.nextInt();
        op = scanner.next().charAt(0);
        b = scanner.nextInt();
        int res = 0;
        switch(op) {
            case '+':
                res = a+b;
            case '-':
                res = a-b;
            case '*':
                res = a*b;
            case '/':
                if(b == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    return;
                }
                res = a/b;
        }
        System.out.println(Integer.toString(a) + op + Integer.toString(b) + "의 계산결과는 " + res);
    }
}
