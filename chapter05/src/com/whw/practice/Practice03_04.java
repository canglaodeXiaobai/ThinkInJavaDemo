package com.whw.practice;

/**
 * com.whw.practice
 * Practice03_04
 * 3. 创建一个带默认构造器的类，在构造器中打印一条消息，为这个类创建一个对象
 * 4. 为前一个练习类中重载一个构造器，令其接受一个字符串参数，并打印出来
 * @author Mr.wang
 * @date 2019/5/19 9:52
 */
public class Practice03_04 {
    public static void main(String[] args) {
        Practice03_04Entity practice03_04Entity = new Practice03_04Entity();

        Practice03_04Entity practice03_04Entity1 = new Practice03_04Entity("这是传入字符串的对象");

    }
}
