package com.whw.practice;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Random;

/**
 * @ClassName Practice08
 * @Author JL_Computer
 * @Date 2019/5/17 14:49
 * @Description 写一个switch开关语句，为每个case打印一个消息。然后把这个switch放进for循环来测试每个case。先让每个case后面都有break，测试一下会怎样；然后把break删了，看看会怎样。
 */
public class Practice08 {

    public static void main(String[] args) {
        Random random = new Random(47);
        for (int i = 0; i < 10; i ++) {
            int num = random.nextInt(6) + 1;
            System.out.println(num);
            switch (num) {
                case 1 :
                    System.out.println("随机数是" + 1);
                    // break;
                case 2 :
                    System.out.println("随机数是" + 2);
                    // break;
                case 3 :
                    System.out.println("随机数是" + 3);
                    // break;
                case 4 :
                    System.out.println("随机数是" + 4);
                    // break;
                case 5 :
                    System.out.println("随机数是" + 5);
                    // break;
                default:
                    System.out.println("其他6");
            }
        }
    }
}
