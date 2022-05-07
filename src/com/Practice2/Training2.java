package com.Practice2;

public class Training2 {
    public static void main(String[] args) {
        int n [][] = {{1},{1,2,3},{1},{1,2,3,4},{1,2}};
        for(var item1 : n) {
            for(var item2 : item1) {
                System.out.printf("%d ",item2);
            }
            System.out.println();
        }
    }
}
