package com.whw.practic;

public class Practice05 {
    public static void main(String[] args) {
        Dog spot = new Dog();
        spot.setName("spot");
        spot.setSays("Ruff");

        Dog scruffy = new Dog();
        scruffy.setName("scruffy");
        scruffy.setSays("Wurf");

        System.out.println(spot.getName() + "：" + spot.getSays());
        System.out.println(scruffy.getName() + "：" + scruffy.getSays());

        // Practice06

        System.out.println("Practice06===========================");
        Dog dog = spot;

        System.out.println(spot == dog);
        System.out.println(spot == scruffy);
        System.out.println(dog == scruffy);

        System.out.println(spot.equals(dog));
        System.out.println(spot.equals(scruffy));
        System.out.println(dog.equals(scruffy));

    }
}

class Dog{
    private String name;
    private String says;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSays() {
        return says;
    }

    public void setSays(String says) {
        this.says = says;
    }
}