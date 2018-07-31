//package com.pandawork.common.entity;
//
//import javax.persistence.Column;
//import javax.persistence.Id;
//
//public class User {
//
//    //user ID
//
//    @Id
//    public Integer id;
//
//    //user用户名
//
//    @Column(name = "user_userName")
//    private String userName;
//
//    //user密码
//
//    @Column(name = "user_password")
//    private int password;
//
//    //user手机号
//
//    @Column(name = "user_phone")
//    private int phone;
//
//    //user qq
//
//    @Column(name = "user_qq")
//    private int qq;
//
//    //user email
//
//    @Column(name = "user_email")
//    private String email;
//
//    //定义get和set方法
//
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getUserName() {
//        return userName;
//    }
//
//    public void setUserName(String userName) {
//        this.userName = userName;
//    }
//
//    public int getPassword() {
//        return password;
//    }
//
//    public void setPassword(int password) {
//        this.password = password;
//    }
//
//    public int getPhone(){
//        return phone;
//    }
//
//    public void setPhone(int phone) {
//        this.phone = phone;
//    }
//
//    public int getQq() {
//        return qq;
//    }
//
//    public void setQq(int qq) {
//        this.qq = qq;
//    }
//
//    public String getEmail() {
//        return this.email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    //toString方法进行重写  返回一个代表该对象的描述性字符串
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }
//}