
package com.ocp;

public class Calc {
    public static void main(String[] args) {
       Area a1 = new Area();
       a1.h =100;
       a1.w=50;
       //第一種無回傳行的方法
       a1.calcAndPrint();
       //第二種有回傳值得方法
       int sum = a1.calcNotPrint();
        System.out.println(sum);
           
    }
}
