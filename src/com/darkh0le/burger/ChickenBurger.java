package com.darkh0le.burger;

public class ChickenBurger extends Burger{

    public ChickenBurger() {
        this.price = 49.99F;
        this.name = this.getClass().getSimpleName();
        this.ingredients.put(1, "Botton Bun");
        this.ingredients.put(2, "Chicken");
        this.ingredients.put(3, "Veggies");
        this.ingredients.put(4, "Top Bun");
    }
}
