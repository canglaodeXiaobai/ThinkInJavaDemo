package com.whw.practice;

import java.util.Date;
import java.util.List;

/**
 * @ClassName Practice10
 * @Author JL_Computer
 * @Date 2019/5/17 15:43
 * @Description 吸血鬼数字是指位数为偶数的数字，可以由一对数字相乘而得到，而这对数字各含乘积的一半位数的数字，
 * 其中从最初的数字中选取的数字可以任意排序。以两个0结尾的数字是不允许的，例如，下列数字都是“吸血鬼”数字：
 * 1260 = 21 * 60
 * 1827 = 21 * 87
 * 2187 = 27 * 81
 * 写一个程序，找出4位数的所有吸血鬼数字。
 */
public class Practice10 {

    public static int count = 0;
    public static void main(String[] args) {
        long startTime = new Date().getTime();
        for (int i = 1000; i < 10000; i++) {
            if (i % 100 == 0) {
                continue;
            }

            int a = a(i);
            int b = b(i);
            int c = c(i);
            int d = d(i);

            test(i, a, b, c, d);
            test(i, a, b, d, c);
            test(i, a, c, b, d);
            test(i, a, c, d, b);
            test(i, a, d, b, c);
            test(i, a, d, c, b);
            test(i, b, a, c, d);
            test(i, b, a, d, c);
            test(i, b, c, d, a);
            test(i, b, d, c, a);
            test(i, c, a, d, b);
            test(i, c, b, d, a);

        }
        System.out.println((new Date().getTime() - startTime) + "ms");
        System.out.println(count);
    }

    public static void test(int i,int a, int b, int c, int d) {
        count ++;
        int j = a * 10 + b;
        int k = c * 10 + d;
        pro(i, j, k);
    }
    public static int a (int i) {
        count ++;
        return i / 1000;
    }

    public static int b (int i) {
        count ++;
        return (i % 1000) / 100;
    }

    public static int c (int i) {
        count ++;
        return ((i % 1000) % 100) / 10;
    }

    public static int d (int i) {
        count ++;
        return i % 10;
    }

    public static int cou(int i, int j) {
        count ++;
        return i * 10 + j;
    }

    public static void pro(int i, int j, int k) {
        count ++;
        if (i == j * k)
        System.out.println(i + " = " + j + " * " + k);
    }
}
