package com.darkh0le.burger;

import java.util.HashMap;
import java.util.Map;

public class Burger {

     String name;
     Float price;
     Map<Integer,String> ingredients = new HashMap<>();
     Boolean ready = false;

    public float delirver() {
        System.out.println("Boxed and delivered");
        ready = true;
        return this.price;
    }
    @Override
    public String toString() {
        return "Burger{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", ingredients=" + ingredients +
                '}';
    }
}
