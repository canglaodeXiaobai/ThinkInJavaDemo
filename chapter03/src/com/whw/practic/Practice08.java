package com.whw.practic;

/**
 * 展示用十六进制和八进制计数法来操作long值,用Long.toBinaryString()来显示结果.
 */
public class Practice08 {
    public static void main(String[] args) {
        long l1 = 123L;
        long l2 = 0xaaaL;
        long l3 = 01457;

        System.out.println("l1(" + l1 + ") = " + Long.toBinaryString(l1));
        System.out.println("l2(" + l2 + ") = " + Long.toBinaryString(l2));
        System.out.println("l3(" + l3 + ") = " + Long.toBinaryString(l3));

    }
}
