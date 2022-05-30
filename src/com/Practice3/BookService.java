package com.Practice3;

import java.util.Scanner;

public class BookService {

    private BookData bookData;
    private final Scanner scanner;

    public BookService() {
        scanner = new Scanner(System.in);
        bookData = new BookData();
    }

    public void book() throws BookData.DoesNotExistException {
        boolean chk = true;
        while(chk) {
            try {
                System.out.print("좌석 구분 S(1) A(2) B(3)>>");
                int sel = scanner.nextInt();
                printData(sel);
                System.out.print("이름>>");
                String name = scanner.next();
                System.out.print("번호>>");
                int number = scanner.nextInt();
                bookData.setSeat(name, number, sel);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("잘못된 번호를 입력하셨습니다. 다시 입력해 주세요.");
                continue;
            }
            chk = false;
        }
    }

    public void CheckAllSeats() throws BookData.DoesNotExistException {
        printData(1);
        printData(2);
        printData(3);
        System.out.println("<<조회를 완료하였습니다.>>");
    }

    public void cancel() throws BookData.DoesNotExistException {
        System.out.print("좌석 구분 S(1) A(2) B(3)>>");
        int sel = scanner.nextInt();
        printData(sel);
        System.out.print("이름>>");
        String name = scanner.next();
        bookData.cancelSeat(name,sel);
    }

    private void printData(int sel) throws BookData.DoesNotExistException {
        String[] s =  bookData.getSeat(sel);
        String displayName = bookData.getSeatName(sel);
        System.out.print(displayName + ">>");
        for(var item : s) {
            System.out.print((item != null ? item : "---")+" ");
        }
        System.out.println();
    }
}
