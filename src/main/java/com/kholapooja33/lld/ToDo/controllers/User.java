package com.kholapooja33.lld.ToDo.controllers;


public class User {
    private String userName;
    private String email;
    private Integer phoneNo;

    public User(String userName, String email, Integer phoneNo) {
        this.userName = userName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Integer phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo=" + phoneNo +
                '}';
    }
}
