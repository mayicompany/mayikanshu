package com.mayiwo.mayikanshu.model;

import java.math.BigInteger;

public class Admin {

    private Integer id;
    private String a_name;  //姓名
    private String a_user;  //账号
    private String a_password;  //密码
    private String a_position;  //职位
    private String a_images;  //头像
    private Integer a_sex;     //性别
    private BigInteger a_phone;  //电话
    private Integer a_age;  //年龄

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getA_name() {
        return a_name;
    }

    public void setA_name(String a_name) {
        this.a_name = a_name;
    }

    public String getA_user() {
        return a_user;
    }

    public void setA_user(String a_user) {
        this.a_user = a_user;
    }

    public String getA_password() {
        return a_password;
    }

    public void setA_password(String a_password) {
        this.a_password = a_password;
    }

    public String getA_position() {
        return a_position;
    }

    public void setA_position(String a_position) {
        this.a_position = a_position;
    }

    public String getA_images() {
        return a_images;
    }

    public void setA_images(String a_images) {
        this.a_images = a_images;
    }

    public Integer getA_sex() {
        return a_sex;
    }

    public void setA_sex(Integer a_sex) {
        this.a_sex = a_sex;
    }

    public BigInteger getA_phone() {
        return a_phone;
    }

    public void setA_phone(BigInteger a_phone) {
        this.a_phone = a_phone;
    }

    public Integer getA_age() {
        return a_age;
    }

    public void setA_age(Integer a_age) {
        this.a_age = a_age;
    }
}
