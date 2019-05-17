package com.whw.practic;

/**
 * @ClassName Practice14
 * @Author JL_Computer
 * @Date 2019/5/17 9:51
 * @Description 编写一个接收两个字符串参数的方法, 用各种布尔值的比较关系来比较这两个字符串, 然后把结构打印出来.
 * 做==和!=比较的同事,用equals()作测试.在main()里面用几个不同的字符串对象调用这个方法
 */
public class Practice14 {

    public static void compareStr(String str1, String str2) {

        System.out.println("(" + str1 + " compareTo " + str2 + ") = " + (str1.compareTo(str2)));
        System.out.println("(" + str1 + " == " + str2 + ") = " + (str1 == str2));
        System.out.println("(" + str1 + " != " + str2 + ") = " + (str1 != str2));
        System.out.println("(" + str1 + " equals " + str2 + ") = " + (str1.equals(str2)));

    }

    public static void main(String[] args) {
        compareStr("abc", "abc");
    }
}
