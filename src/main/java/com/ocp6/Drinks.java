package com.ocp6;

public class Drinks {
    private String name;
    private int price;

    public Drinks() {
    }

    public Drinks(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Drinks{" + "name=" + name + ", price=" + price + '}';
    }
    

}
