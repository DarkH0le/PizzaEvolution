package com.darkh0le.burger;

public class CheesBurger extends Burger {

    public CheesBurger() {
        this.price = 49.99F;
        this.name = this.getClass().getSimpleName();
        this.ingredients.put(1, "Botton Bun");
        this.ingredients.put(2, "Meat");
        this.ingredients.put(3, "Veggies");
        this.ingredients.put(4, "Top Bun");
    }
}
