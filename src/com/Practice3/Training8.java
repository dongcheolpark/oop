package com.Practice3;

import java.util.Scanner;

public class Training8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("인원수>>");
        int n = scanner.nextInt();
        PhoneBook phoneBook = new PhoneBook(n);

        for(int i = 0;i<n;i++) {
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");

            String name = scanner.next();
            String phoneNumber = scanner.next();
            phoneBook.add(name,phoneNumber);
        }

        while(true) {
            System.out.print("검색할 이름>>");
            String answer = scanner.next();
            if(answer.equals("그만")) break;
            Phone phone = phoneBook.find(answer);
            if(phone != null) {
                System.out.println(answer +"의 번호는 " + phone.getPhoneNumber() + " 입니다.");
            }
            else {
                System.out.println(answer + " 이(가) 없습니다.");
            }
        }
    }
}
