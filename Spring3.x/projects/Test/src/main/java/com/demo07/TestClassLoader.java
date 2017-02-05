package com.demo07;

/**
 * Created by Tondiyee on 2017/1/24.
 */
public class TestClassLoader {
    public static void main(String[] args) {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        System.out.println(classLoader);
        System.out.println(classLoader.getParent());
        System.out.println(classLoader.getParent().getParent());
    }
}
