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

    /*public static int count = 0;
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
*/

    public static void main(String[] args) {
        Practice10 p = new Practice10();
        long start = new Date().getTime();
        p.fun1();
        long end = new Date().getTime();
        System.out.println("方法一使用时间：" + (end - start) + "ms");

    }

    /**
     * 方法一
     */
    public void fun1() {
        for (int i = 1000; i < 10000; i ++) {
            if (i % 100 == 0) {
                continue;
            }
            int a = a(i);
            int b = b(i);
            int c = c(i);
            int d = d(i);

            product(i, a, b, c, d);
            product(i, a, b, d, c);
            product(i, a, c, b, d);
            product(i, a, c, d, b);
            product(i, a, d, b, c);
            product(i, a, d, c, b);
            product(i, b, a, c, d);
            product(i, b, a, d, c);
            product(i, b, c, d, a);
            product(i, b, d, c, a);
            product(i, c, a, d, b);
            product(i, c, b, d, a);
        }
    }

    /**
     * 千位
     * @param num 传入的数字
     * @return 千位数字
     */
    public int a (int num) {
        return num / 1000;
    }

    /**
     * 百位
     * @param num 传入的数
     * @return 百位数字
     */
    public int b (int num) {
        return (num % 1000) / 100;
    }

    /**
     * 十位
     * @param num 传入的数字
     * @return 十位数字
     */
    public int c (int num) {
        return ((num % 1000) % 100) / 10;
    }

    /**
     * 各位
     * @param num 传入的数字
     * @return 个位数字
     */
    public int d (int num) {
        return num % 10;
    }

    /**
     * 组成两位数的数字
     * @param i 十位数字
     * @param j 个位数字
     * @return 两位数的数字
     */
    /*public int com (int i, int j) {
        return i * 10 + j;
    }*/

    /**
     * 生成吸血鬼数字
     * @param num
     * @param i
     * @param j
     * @return
     */
    public void vampire (int num, int i, int j) {
        if (num == i * j)
            System.out.println(num + " = " + i + " * " + j);
    }

    /**
     * 生成
     * @param num
     * @param a
     * @param b
     * @param c
     * @param d
     */
    public void product (int num, int a, int b, int c, int d) {
        int i = a * 10 + b;
        int j = c * 10 + d;
        vampire(num, i, j);
    }

}
