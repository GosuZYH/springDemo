/*******************************************************************************
 *   (C) Copyright . Corporation 2023 All Rights Reserved.
 * *****************************************************************************
 *    Author    : GosuZYH
 *    FileName  : User
 *     Time     : 2023/11/28-16:19
 *******************************************************************************/
package com.example.myspring.entities;

public class User {
    private String name;
    private String sex;
    private Integer age;

    public User() {

    }

    public User(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

