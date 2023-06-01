package com.example.day1;

public class sinhvien {
    private String title;
    private String name;
    private String Address;

    public sinhvien(String title, String name, String address) {
        this.title = title;
        this.name = name;
        Address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
