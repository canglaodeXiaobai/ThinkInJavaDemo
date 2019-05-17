package com.whw.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Practice09
 * @Author JL_Computer
 * @Date 2019/5/17 14:54
 * @Description 一个斐波那契数列是由数字1、1、2、3、5、8、13、21、34等等组成的，其中每一个数字（从第三个数字起）
 * 都是前两个数字的和。创建一个方法，接收一个整数参数，并显示从第一个元素开始总共由该参数指定的个数所构成
 * 的所有斐波那契数字。例如，如果运行java Fibonacci 5(其中Fibonacci是类名)，那么输出就应该
 * 是1、1、2、3、5。
 */
public class Practice09 {

    public static void main(String[] args) {

        int times = 3;
        for (int i = 1; i <= times; i++) {
            System.out.print(fibonacci(i) + "\t");
        }
    }

    public static int fibonacci(int times) {
        if (times == 1) {
            return 1;
        } else if (times == 2) {
            return 1;
        } else {
            return fibonacci(times - 1) + fibonacci(times - 2);
        }
    }
}
