package com.whw.practic;

import static java.lang.System.out;
/**
 * 使用简短和正常的打印语句打印
 */
public class Practic01 {

    public static void main(String[] args) {
        // 正常的语句
        System.out.println("正常的语句打印");
        System.out.printf("%s", "打印");
        System.out.println("-----正常的语句打印结束-----");
        System.out.println();
        // 简短的
        out.println("简短的语句打印");
        out.print(1);
        out.println();
        out.println("-----简短的语句打印结束-----");
    }
}
