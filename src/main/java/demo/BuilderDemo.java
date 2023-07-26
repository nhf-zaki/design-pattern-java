package demo;

import patterns.creational.builder.LunchMenuV1;
import patterns.creational.builder.LunchMenuV2;
import patterns.creational.builder.LunchMenuVF;

public class BuilderDemo {
    public static void main(String[] args) {

        LunchMenuV1 menuV1 = new LunchMenuV1();

        menuV1.setBread("Wheat");
        menuV1.setSalad("Lettuce");
        menuV1.setDressing("Mustard");
        menuV1.setMeat("Ham");

        System.out.println(menuV1.getBread());
        System.out.println(menuV1.getSalad());
        System.out.println(menuV1.getDressing());
        System.out.println(menuV1.getMeat());

        System.out.println();

        LunchMenuV2 menuV2 = new LunchMenuV2("Wheat", "Lettuce", "Mustard", "Ham");

        System.out.println(menuV2.getBread());
        System.out.println(menuV2.getSalad());
        System.out.println(menuV2.getDressing());
        System.out.println(menuV2.getMeat());

        System.out.println();

        LunchMenuVF menuVF = new LunchMenuVF.Builder()
                    .bread("Wheat")
                    .salad("Lettuce")
                    .dressing("Mayo")
                    .meat("Turkey")
                .build();

        System.out.println(menuVF.getBread());
        System.out.println(menuVF.getSalad());
        System.out.println(menuVF.getDressing());
        System.out.println(menuVF.getMeat());

    }
}
