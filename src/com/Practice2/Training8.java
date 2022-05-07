package com.Practice2;

import java.util.Random;
import java.util.Scanner;

public class Training8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 몇개?");
        int n = scanner.nextInt();
        int arr [] = new int[n];

        Random random = new Random();
        random.setSeed(System.currentTimeMillis());

        for(int i = 0;i<n;i++) {
            boolean chk = false;
            do {
                chk = false;
                arr[i] = random.nextInt(100);
                for(int j = 0;j<i;j++) {
                    if(arr[i] == arr[j]) {
                        chk = true;
                        break;
                    }
                }
            }
            while(chk);
            System.out.printf("%d ",arr[i]);
            if(i%10 == 0&&i!=0) System.out.println();
        }
    }
}
