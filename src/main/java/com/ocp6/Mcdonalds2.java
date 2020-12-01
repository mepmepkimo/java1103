package com.ocp6;

import java.util.Arrays;

public class Mcdonalds2 {

    public static void main(String[] args) {
        Hamburger h1 = new Hamburger("大麥克", 70);
        Hamburger h2 = new Hamburger("麥香魚", 50);
        SideMeal s1 = new SideMeal("薯條", "大", 55);
        SideMeal s2 = new SideMeal("沙拉", 40);
        Drinks d1 = new Drinks("可樂", 30);
        Drinks d2 = new Drinks("咖啡", 50);

//我買了
        Hamburger[] hamburgers = {h1, h2};
        SideMeal[] sideMeals = {s1, s2};
        Drinks[] drinks = {d1, d2};
//總金額
        int sum = 0;

        for (Hamburger hamburger : hamburgers) {
            sum += hamburger.getPrice();
        }
        for (SideMeal sideMeal : sideMeals) {
            sum += sideMeal.getPrice();
        }
        for (Drinks drink :drinks ) {
            sum += drink.getPrice();
        }

        System.out.printf("總金額 $%d\n", sum);
        System.out.printf("你買的有:%s\n,%s\n,%s\n", Arrays.toString(hamburgers), Arrays.toString(sideMeals), Arrays.toString(drinks));

    }
}
