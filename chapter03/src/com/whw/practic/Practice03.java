package com.whw.practic;

/**
 * 创建一个包含一个float域的类，并用这个方法来展示方法调用时的别名机制
 */
public class Practice03 {
    public static void f(Practice03Entity pe) {
        pe.setElem(333.33f);
    }

    public static void main(String[] args) {
        Practice03Entity pe = new Practice03Entity();
        System.out.println("pe.elem = " + pe.getElem());
        System.out.println();
        f(pe);
        System.out.println("pe.elem = " + pe.getElem());
    }
}

class Practice03Entity {
    private float elem = 3.1415926f;

    public float getElem() {
        return elem;
    }

    public void setElem(float elem) {
        this.elem = elem;
    }
}