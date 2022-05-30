package com.Practice3;

public class Phone {
    private String name;
    private String phoneNumber;

    public Phone(String name,String PhoneNumber) {
        this.name = name;
        this.phoneNumber = PhoneNumber;
    }

    public boolean IsSame(String name) {
        if(this.name.equals(name)) {
            return true;
        }
        return false;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
