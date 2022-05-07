package com.Practice2;

import java.util.Scanner;

public class Training14 {
    public static void main(String[] args) {
        String course[] = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
        int score[] = {95,88,76,62,55};
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("과목 이름>>");
            String str = scanner.next();
            if(str.equals("그만")) {
                System.out.println("종료합니다...");
                break;
            }
            boolean chk = false;
            for(int i = 0;i<course.length;i++) {
                if(course[i].equals(str)) {
                    System.out.printf("%s의 점수는 %d\n",str,score[i]);
                    chk = true;
                    break;
                }
            }
            if(!chk) {
                System.out.println("없는 과목입니다.");
            }
        }
    }
}
