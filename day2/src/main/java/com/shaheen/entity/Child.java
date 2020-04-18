package com.shaheen.entity;

public class Child {
    private int age;
    private String name;
    private String Address;


    public Child() {
        System.out.println(toString());
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    @Override
    public String toString() {
        return "Child{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
