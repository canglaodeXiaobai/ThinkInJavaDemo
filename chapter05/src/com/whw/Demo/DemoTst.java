package com.whw.Demo;

/**
 * @ClassName DemoTst
 * @Author JL_Computer
 * @Date 2019/5/20 10:22
 * @Description
 */
public class DemoTst {
    public static void main(String[] args) {
        /*Spiciness howHot = Spiciness.HOT;
        System.out.println(howHot);*/

        for (Spiciness s : Spiciness.values()) {
            System.out.println(s + ", ===> " + s.ordinal());
        }
    }
}
