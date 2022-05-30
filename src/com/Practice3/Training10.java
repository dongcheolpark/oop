package com.Practice3;

import java.util.Scanner;

public class Training10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("한영 단어 검색 프로그램입니다.");
        while(true) {
            System.out.print("한글단어?");
            String str = scanner.next();
            if(str.equals("그만")) break;
            String word = Dictionary.kor2Eng(str);
            if(word != null) {
                System.out.println(str + "은(는) " + word);
            }
            else {
                System.out.println(str + "은(는) 저의 사전에 없습니다.");
            }
        }
    }
}
