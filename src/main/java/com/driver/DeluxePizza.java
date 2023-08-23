package com.driver;

public class DeluxePizza extends Pizza {

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public void addExtraCheese() {

    }

    @Override
    public void addExtraToppings() {

    }

    @Override
    public void addTakeaway() {
        super.addTakeaway();
    }

    @Override
    public String getBill() {
        return super.getBill();
    }

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
    }
}
