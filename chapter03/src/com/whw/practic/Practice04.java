package com.whw.practic;

/**
 * 编写一个计算速度的程序，它使用的距离和时间都是常量
 */
public class Practice04 {

    public static final double DISTANCE = 40076 * 1000;
    public static final double TIME = 23 * 60 + 56 * 60 + 4;

    public static void main(String[] args) {
        System.out.println("速度 = 距离 / 时间");

        System.out.println("(DISTANCE)" + DISTANCE + " / " + "(TIME)" + TIME + " = " + (DISTANCE / TIME));

    }
}
