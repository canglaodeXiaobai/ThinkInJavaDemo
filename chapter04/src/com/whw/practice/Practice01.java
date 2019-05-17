package com.whw.practice;

/**
 * @ClassName Practice01
 * @Author JL_Computer
 * @Date 2019/5/17 10:45
 * @Description 打印从1到100的值
 */
public class Practice01 {
    public static void main(String[] args) {
        System.out.println("使用for循环-----------");
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + "\t");
            if (i % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\nwhile-----------------");
        int num = 1;
        while (num <= 100) {
            System.out.print(num++ + "\t");
            if ((num - 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\ndo-while-----------------");
        num = 1;
        do {
            System.out.print(num ++ + "\t");
            if ((num - 1) % 10 == 0) {
                System.out.println();
            }
        } while (num <= 100);
    }
}
