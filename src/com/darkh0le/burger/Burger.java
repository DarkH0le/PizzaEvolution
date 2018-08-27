package com.darkh0le.burger;

import java.util.HashMap;
import java.util.Map;

public class Burger {

     String name;
     Float price;
     Map<Integer,String> ingredients = new HashMap<>();

    public float deliver() {
        System.out.println("Boxed and delivered");
        return this.price;
    }

    public String getInfoBurger() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ingredients=" + ingredients +
                '}';
    }
}
