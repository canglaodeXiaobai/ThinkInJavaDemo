package com.whw.practic;

/**
 * @ClassName Practice11_13
 * @Author JL_Computer
 * @Date 2019/5/16 17:36
 * @Description 以一个最高有效位为1的二进制数开始, 用有符号右移操作符对其进行右移, 直至所有的二进制位都被移出为止, 每移一位都显示二进制字符串效果.
 * <p>以一个所有位都为1的二进制数字开始,先左移它,然后用无符号右移操作符对其进行右移,直至所有二进制位都移出为止,每移一位都要显示二进制字符串效果.</p>
 * <p>编写一个方法,它以二进制形式显示char类型的值.使用多个不同的字符来展示它.</p>
 */
public class Practice11_13 {

    public static void main(String[] args) {
        System.out.println("以一个最高有效位为1的二进制数开始, 用有符号右移操作符对其进行右移, 直至所有的二进制位都被移出为止, 每移一位都显示二进制字符串效果.");
        int i = 0xF3A7;
        System.out.println("int: " + i + "， binary: " + Integer.toBinaryString(i));

        while (i != 0) {
            i >>= 1;
            System.out.println("int: " + i + "， binary: " + Integer.toBinaryString(i));
        }

        System.out.println();
        System.out.println("============================================================================");
        System.out.println("以一个所有位都为1的二进制数字开始,先左移它,然后用无符号右移操作符对其进行右移,直至所有二进制位都移出为止,每移一位都要显示二进制字符串效果.");
        int num = 0xFFFF;
        System.out.println("int: " + num + "， binary: " + Integer.toBinaryString(num));
        num <<= 1;
        System.out.println("int: " + num + "， binary: " + Integer.toBinaryString(num));

        while (num > 0) {
            num >>>= 1;
            System.out.println("int: " + num + "， binary: " + Integer.toBinaryString(num));
        }

        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("编写一个方法,它以二进制形式显示char类型的值.使用多个不同的字符来展示它.");

        System.out.println("a: " + showCharBinary('a'));
        System.out.println("@: " + showCharBinary('@'));
        System.out.println("1: " + showCharBinary('1'));
        System.out.println("=: " + showCharBinary('='));
    }

    public static String showCharBinary(char c) {

        return Integer.toBinaryString(c);
    }
}
