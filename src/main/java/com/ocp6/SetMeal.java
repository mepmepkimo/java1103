package com.ocp6;

public class SetMeal {
    private Hamburger hamburger;
    private SideMeal sideMeal;
    private Drinks drinks;
    //總金額
    private  int sum;

    public SetMeal(Hamburger hamburger, SideMeal sideMeal, Drinks drinks) {
        this.hamburger = hamburger;
        this.sideMeal = sideMeal;
        this.drinks = drinks;
        this.sum=hamburger.getPrice()+sideMeal.getPrice()+drinks.getPrice();
    }

    public int getSum() {
        return sum;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public SideMeal getSideMeal() {
        return sideMeal;
    }

    public void setSideMeal(SideMeal sideMeal) {
        this.sideMeal = sideMeal;
    }

    public Drinks getDrinks() {
        return drinks;
    }

    public void setDrinks(Drinks drinks) {
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "SetMeal{" + "hamburger=" + hamburger + ", sideMeal=" + sideMeal + ", drinks=" + drinks + '}';
    }

}
