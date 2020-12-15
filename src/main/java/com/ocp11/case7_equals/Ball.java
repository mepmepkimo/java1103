//
//package com.ocp11.case7_equals;
//
//public class Ball {
//    private int price;
//    private int color;
//    // 覆寫 equals 方法
//    @Override
//    public boolean equals(Object obj) {
//        Ball b = (Ball)obj;
//        if(b.price == price && b.color.equals(color)) {
//            return true;
//        }
//        return false;
//    }
//    
//    //覆寫hashcode方法
//    @Override
//    public int hashcode(){
//        //攻勢:2個質數+或*上有比較的屬性值
//        return  7*11 +price +color.hashcode();
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//    public int getColor() {
//        return color;
//    }
//
//    public void setColor(int color) {
//        this.color = color;
//    }
//
//    @Override
//    public String toString() {
//        return "Ball{" + "price=" + price + ", color=" + color + '}';
//    }
//}
//
//
