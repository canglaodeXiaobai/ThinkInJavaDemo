package com.whw.practice;

import java.util.Random;

/**
 * @ClassName Practice03
 * @Author JL_Computer
 * @Date 2019/5/17 10:58
 * @Description 修改练习2，把代码用一个while无限循环包括起来。然后运行它直至用键盘中断其运行（通常是通过按Ctrl+c)
 */
public class Practice03 {
    public static void main(String[] args) {
        while (true) {
            Random random = new Random(47);
            for (int i = 0; i < 25; i++) {
                int a = random.nextInt();
                int b = random.nextInt();
                if (a > b) {
                    System.out.println(a + " > " + b);
                } else if (a < b) {
                    System.out.println(a + " < " + b);
                } else {
                    System.out.println(a + " = " + b);
                }
            }
        }
    }
}
