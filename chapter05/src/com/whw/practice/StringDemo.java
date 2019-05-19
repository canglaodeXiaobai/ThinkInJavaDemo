package com.whw.practice;

/**
 * com.whw.practice
 * StringDemo
 *
 * @author Mr.wang
 * @date 2019/5/18 20:47
 */
public class StringDemo {
    private String nullStr;
    private String str = "原始的";

    public StringDemo() {

    }

    public StringDemo(String str) {
        this.str = str;
    }

    public StringDemo(String nullStr, String str) {
        this.nullStr = nullStr;
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getNullStr() {
        return nullStr;
    }

    public void setNullStr(String nullStr) {
        this.nullStr = nullStr;
    }
}
