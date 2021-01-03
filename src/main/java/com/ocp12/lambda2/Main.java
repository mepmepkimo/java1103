package com.ocp12.lambda2;

public class Main {

    public static void main(String[] args) {

        //Java8
        Add add = (x, y,z) -> x + y+z;//加法邏輯
        Add add2 = (x, y,z) -> {
            return x * y*z;
        };//乘法邏輯
        System.out.println("s1"+add.sum(10,10, 20));
        System.out.println("s2"+add2.sum(10,20, 20));
        oneAdd(add);
        oneAdd(add2);
        oneAdd((x, y,z) -> x / y);
        oneAdd((x, y,z) -> x - y);
    }

    public static void oneAdd(Add a1) {
        System.out.println(a1.sum(10, 20,20));
    }
    public static void oneAss(Add a2){
        System.out.println(a2.sum(100, 2,10));
    }

}
