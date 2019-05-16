package com.whw.practic;

/**
 * @ClassName Practice10
 * @Author JL_Computer
 * @Date 2019/5/16 14:14
 * @Description 编写一个具有两个常量值的程序, 一个具有交替的二进制位1和0, 其中最低有效位为0, 另一个也具有交替的二进制位1和0, 其中最低有效位为1.
 * 取这两个值,用按位操作符以所有可能的方式结合运算它们,然后用Integer.toBinaryString()显示
 */
public class Practice10 {

    public static void main(String[] args) {

        // 0b开头的代表二进制
        int number1 = 0b1010101010;
        int number2 = 0b101010101;

        System.out.println(number1);
        System.out.println(number2);

        System.out.println("===============================");

        System.out.println(number1 + " & " + number2 + " = " + Integer.toBinaryString(number1 & number2));
        System.out.println(number1 + " | " + number2 + " = " + Integer.toBinaryString(number1 | number2));
        System.out.println(number1 + " ^ " + number2 + " = " + Integer.toBinaryString(number1 ^ number2));
        System.out.println("~" + number1 + " = " + Integer.toBinaryString(~number1));
        System.out.println("~" + number2 + " = " + Integer.toBinaryString(~number2));

        System.out.println(number2 + " & " + number1 + " = " + Integer.toBinaryString(number2 & number1));
        System.out.println(number2 + " | " + number1 + " = " + Integer.toBinaryString(number2 | number1));
        System.out.println(number2 + " ^ " + number1 + " = " + Integer.toBinaryString(number2 ^ number1));


    }

}
