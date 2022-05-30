package com.Practice3;

public class Dictionary {
    private static String [] kor = {"사랑","아기","돈","미래","희망"};
    private static String [] eng = {"love","baby","money","future","hope"};
    public static String kor2Eng(String word) {
        int size = kor.length;
        int index = -1;
        for(int i = 0;i<size;i++) {
            if(kor[i].equals(word)) {
                index = i;
            }
        }
        return index != -1 ? eng[index] : null;
    }
}
