package com.ocp11.case7_equals;

import java.util.Objects;

public class Ball {

    private int price;
    private String color;

    public Ball(int price, String color) {
        this.price = price;
        this.color = color;
    }
//    //覆寫EQUALS的方法
//    @Override
//    public boolean equals(Object obj) {
//        Ball b = (Ball) obj;
//        if (b.price == price && b.color.equals(color)) {//price 是 int 所以可以用 == 做比較  color是 String 所以只能用EQUALS來比較
//
//        }
//        return true;
//    }
//
//    //覆寫hashcode方法
//    @Override
//    public int hashCode() {
//        //公式:2個質數 + 或* 上有比較的屬性值
//        return 7 * 11 * price + color.hashCode();  //7*11*price 與下方的89原因為何
//    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.price;
        hash = 89 * hash + Objects.hashCode(this.color);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ball other = (Ball) obj;
        if (this.price != other.price) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        return true;
    }
    
    

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" + "price=" + price + ", color=" + color + '}';
    }

}
