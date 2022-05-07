package com.Practice2;

import java.util.Scanner;

public class Training16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
            System.out.print("가위 바위 보!>>");

            String input = scanner.next();
            if(input.equals("그만")) {
                System.out.println("게임을 종료합니다..");
                return;
            }
            String str[] = {"가위","바위","보"};
            int n = (int)(Math.random()*3);
            int input_num = 0;
            for(int i = 0;i<3;i++) {
                if(str[i].equals(input)) {
                    input_num = i;
                }
            }
            String ans = "";
            if(input_num == n) {
                ans = "비겼습니다.";
            }
            else if((input_num+1)%3 == n) {
                ans = "사용자가 졌습니다.";
            }
            else {
                ans = "사용자가 이겼습니다.";
            }
            System.out.printf("사용자 = %s , 컴퓨터 = %s, %s\n",input,str[n],ans);
        }
    }
}
