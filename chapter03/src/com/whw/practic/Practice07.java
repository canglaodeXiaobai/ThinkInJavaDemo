package com.whw.practic;

import org.junit.Test;

import java.util.Random;

/**
 * 模拟扔硬币的结果
 */
public class Practice07 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(2);
        System.out.println(a);
        if (a == 0) {
            System.out.println("正面");
        } else {
            System.out.println("反面");
        }

    }

    @Test
    public void test() {

        int i1 = 0x2f;
        System.out.println(Integer.toBinaryString(i1));
        int i2 = 0X2F;
        System.out.println(Integer.toBinaryString(i2));
    }

}
