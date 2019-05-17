package com.whw.practice;

/**
 * @ClassName Practice06
 * @Author JL_Computer
 * @Date 2019/5/17 14:22
 * @Description 修改前两个程序中的两个test()方法，让它们接收两个额外的参数begin和end, 这样在测试testval时将判断它是否在begin和end之间（包括begin和end）的范围内。
 */
public class Practice06 {

    public static int test(int testVal, int begin, int end) {
        if (testVal >= begin && testVal <= end) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(test(5, 1, 10));
        System.out.println(test(10, 5, 6));
        System.out.println(test(5, 5, 8));
    }
}
