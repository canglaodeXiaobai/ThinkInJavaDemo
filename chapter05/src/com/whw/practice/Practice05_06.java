package com.whw.practice;

/**
 * com.whw.practice
 * Practice05_06
 *
 * @author Mr.wang
 * @date 2019/5/19 10:00
 */
public class Practice05_06 {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.bark("barking", 1);

        dog.bark(1, "howling");
    }
}

class Dog {
    public void bark (String s, int i) {
        System.out.println("barking !!!");
    }

    public void bark (int i, String s) {
        System.out.println(s + " !!!");
    }
}
