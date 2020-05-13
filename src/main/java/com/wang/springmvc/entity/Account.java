package com.wang.springmvc.entity;

public class Account {

    private String name;
    private Integer age;

    private User user;

    @Override
    public String  toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", user=" + user +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
