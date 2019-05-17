package com.whw.practice;

import java.util.Random;

/**
 * @ClassName Practice02
 * @Author JL_Computer
 * @Date 2019/5/17 10:54
 * @Description 写一个程序，产生25个int类型的随机数，对于每一个随机数，使用if-else语句来将其分类为大于、小于，或等于紧随它而随机产生的值
 */
public class Practice02 {
    public static void main(String[] args) {
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
