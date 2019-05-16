package com.whw.practic;

/**
 * 创建一个包含一个float域的类，展示别名机制
 */
public class Practice02 {
    public static void main(String[] args) {
        Practice02Entity pe1 = new Practice02Entity();

        pe1.setElem(0.123f);
        System.out.println("pe1.elem = " + pe1.getElem());

        Practice02Entity pe2 = pe1;
        System.out.println("pe2.elem = " + pe2.getElem());
        System.out.println();

        pe2.setElem(123.123f);
        System.out.println("pe1.elem = " + pe1.getElem());
        System.out.println("pe2.elem = " + pe2.getElem());
    }
}

class Practice02Entity {
    private float elem;

    public float getElem() {
        return elem;
    }

    public void setElem(float elem) {
        this.elem = elem;
    }
}
