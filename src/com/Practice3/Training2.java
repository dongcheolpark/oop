package com.Practice3;

import java.util.Scanner;

public class Training2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("수학, 과학, 영어 순으로 3개 입력>>");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int english = scanner.nextInt();
        Grade me = new Grade(math,science,english);
        System.out.println("평균은 " + me.average());

        scanner.close();
    }
}

