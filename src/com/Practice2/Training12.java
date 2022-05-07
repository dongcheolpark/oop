package com.Practice2;

public class Training12 {
    public static void main(String[] args) {
        int res = 0;
        for(var item : args) {
            try {
                int x = Integer.parseInt(item);
                res += x;
            }
            catch (NumberFormatException e) {
                continue;
            }
        }
        System.out.println(res);
    }
}
