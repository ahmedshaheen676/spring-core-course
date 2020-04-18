package com.shaheen.services;

public interface DestroyInterface {
    default void destroy() {
        System.out.println(this.getClass().getName() + " destroy");
    }
}
