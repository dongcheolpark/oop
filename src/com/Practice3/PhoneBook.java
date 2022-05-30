package com.Practice3;

public class PhoneBook {

    private Phone [] data;
    private int size;
    private int real_size;

    public PhoneBook(int n) {
        size = n;
        data = new Phone[size];
        real_size = 0;
    }

    public Phone find(String name) {
        Phone res = null;
        for(var item : data) {
            if(item.IsSame(name)) {
                res = item;
                break;
            }
        }
        return res;
    }

    public void add(Phone phone) {
        data[real_size++] = phone;
    }

    public void add(String name,String phoneNumber) {
        add(new Phone(name,phoneNumber));
    }
}
