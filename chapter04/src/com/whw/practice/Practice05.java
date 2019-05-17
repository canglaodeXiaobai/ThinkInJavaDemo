package com.whw.practice;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Practice05
 * @Author JL_Computer
 * @Date 2019/5/17 11:32
 * @Description 重复第3章中的练习10，不要用Integer.toBinaryString()方法，而是用三元操作符和按位操作符来显示二进制的1和0。
 */
public class Practice05 {


    public static void main(String[] args) {
        int number1 = 682;
        int number2 = 341;

        System.out.println(number1 + " & " + number2 + " = " + Integer.toBinaryString(number1 & number2));
        System.out.println(number1 + " | " + number2 + " = " + Integer.toBinaryString(number1 | number2));
        System.out.println(number1 + " ^ " + number2 + " = " + Integer.toBinaryString(number1 ^ number2));
        System.out.println("~" + number1 + " = " + Integer.toBinaryString(~number1));
        System.out.println("~" + number2 + " = " + Integer.toBinaryString(~number2));

        System.out.println(number2 + " & " + number1 + " = " + Integer.toBinaryString(number2 & number1));
        System.out.println(number2 + " | " + number1 + " = " + Integer.toBinaryString(number2 | number1));
        System.out.println(number2 + " ^ " + number1 + " = " + Integer.toBinaryString(number2 ^ number1));


        System.out.println("        ---------------------------------------------------------------------------------");
        System.out.println(number1 + " & " + number2 + " = " + binary(number1 & number2));
        System.out.println(number1 + " | " + number2 + " = " + binary(number1 | number2));
        System.out.println(number1 + " ^ " + number2 + " = " + binary(number1 ^ number2));
        System.out.println("~" + number1 + " = " + binary(~number1));
        System.out.println("~" + number2 + " = " + binary(~number2));

        System.out.println(number2 + " & " + number1 + " = " + binary(number2 & number1));
        System.out.println(number2 + " | " + number1 + " = " + binary(number2 | number1));
        System.out.println(number2 + " ^ " + number1 + " = " + binary(number2 ^ number1));
    }


    /**
     * 将按位计算的结果逐个与1进行与，然后在无符号右移，在与1进行按位与
     * @param num
     * @return
     */
    public static StringBuffer binary(int num) {
        List<String> list = new ArrayList<>();
        StringBuffer res = new StringBuffer();
        // System.out.println(Integer.toBinaryString(num));
        int temp = 1;
        while (num != 0) {
            list.add(0, (num & temp) == 0 ? "0" : "1");
            num >>>= 1;
        }
        if (list.size() == 0) {
            list.add("0");
        }
        for (String str : list) {
            res.append(str);
        }
        return res;
    }
}
