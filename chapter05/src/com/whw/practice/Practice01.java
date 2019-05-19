package com.whw.practice;

/**
 * com.whw.practice
 * practice01
 * 创建一个类，包含一个未初始化的String引用。验证该引用被java初始化成了null
 * @author Mr.wang
 * @date 2019/5/18 20:40
 */
public class Practice01 {
    public static void main(String[] args) {
        StringDemo stringDemo = new StringDemo();
        System.out.println(stringDemo.getNullStr());
    }
}
