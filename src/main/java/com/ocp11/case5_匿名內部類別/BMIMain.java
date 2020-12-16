
package com.ocp11.case5_匿名內部類別;

public class BMIMain {
    public static void main(String[] args) {
        //JAVA7 以前的寫法
        BMI bmi = new BMI() {
            @Override
            public double getBMIValueByHeightAndWeight(double height, double weight) {
               return weight / Math.pow(height/100, 2);
            }
        };
        System.out.println(bmi.getBMIValueByHeightAndWeight(170, 60));
         
        //JAVA8 LAMDBA
        BMI bmi2=(h,w)->w/Math.pow(h/100,2);
        System.out.println(bmi2.getBMIValueByHeightAndWeight(170, 60));
    }
    
}
