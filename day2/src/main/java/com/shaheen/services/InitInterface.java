package com.shaheen.services;

public interface InitInterface {
    default void init() {
        System.out.println(this.getClass().getName() + " init");
    }
}
