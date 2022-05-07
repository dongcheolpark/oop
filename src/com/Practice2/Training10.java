package com.Practice2;

import java.util.Random;

public class Training10 {
    public static void main(String[] args) {
        int arr [][] = new int[4][4];
        Random random = new Random();
        int indexList [] = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for(int i = 0;i<10;i++) {
            int x = random.nextInt(15-i)+i;
            int tmp = indexList[i];
            indexList[i] = indexList[x];
            indexList[x] = tmp;
        }

        for(int i = 0;i<10;i++) {
            int x = indexList[i];
            arr[x/4][x%4] = random.nextInt(9)+1;
        }

        for(int i = 0;i<4;i++) {
            for(int j = 0;j<4;j++) {
                System.out.printf("%d ",arr[i][j]);
            }
            System.out.println();
        }
    }
}
