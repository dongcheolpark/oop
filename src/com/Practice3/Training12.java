package com.Practice3;

import java.util.Scanner;

public class Training12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookService bookService = new BookService();
        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while(true) {
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int select = scanner.nextInt();
            try {
                switch (select) {
                    case 1:
                        bookService.book();
                        break;
                    case 2:
                        bookService.CheckAllSeats();
                        break;
                    case 3:
                        bookService.cancel();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("잘못 입력하셨습니다. 다시 입력해 주세요.");
                        break;
                }
            }
            catch (BookData.DoesNotExistException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
