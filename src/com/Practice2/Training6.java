package com.Practice2;

import java.util.Scanner;

public class Training6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] unit = {50000,10000,1000,500,100,50,10,1};
        System.out.print("금액을 입력하시오>>");
        int money = scanner.nextInt();

        for(var _unit : unit) {
            int k = money/_unit;
            money %= _unit;
            if(k == 0) continue;
            System.out.printf("%d원 짜리 : %d개\n",_unit,k);
        }
    }
}
