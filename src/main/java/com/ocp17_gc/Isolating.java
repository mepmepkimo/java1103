package com.ocp17_gc;

class Island {

    Island i;//附屬島嶼
    int price;

    public Island(int price) {
        this.price = price;

    }

}

public class Isolating {

    public static void main(String[] args) {
        Island a = new Island(100);
        Island b = new Island(200);
        Island c = new Island(300);
        a.i = b; //a的附屬島嶼是b
        b.i = c; //b的附屬島嶼是c
        System.out.println(a.price);
        System.out.println(a.i.price);
        System.out.println(a.i.i.price);
    }

}
