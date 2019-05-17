package com.whw.practice;

/**
 * @ClassName Practice04
 * @Author JL_Computer
 * @Date 2019/5/17 11:01
 * @Description 写一个程序，使用两个嵌套的for循环和取余操作符（%）来探测和打印素数（只能被其自身和1整除，而不能被其它数字整除的整数）
 */
public class Practice04 {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else if (i % j != 0 && j + 1 == i) {
                    System.out.println("素数：" + i);
                }
            }
        }
    }
}
