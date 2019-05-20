package com.whw.practice;

/**
 * com.whw.practice
 * Practice02
 *
 * @author Mr.wang
 * @date 2019/5/18 20:45
 */
public class Practice02 {
    public static void main(String[] args) {
        StringDemo stringDemo = new StringDemo();
        System.out.println(stringDemo.getStr());

        stringDemo = new StringDemo("后来赋值的");
        System.out.println(stringDemo.getStr());
    }
}

