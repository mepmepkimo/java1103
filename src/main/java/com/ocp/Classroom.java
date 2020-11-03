package com.ocp;

public class Classroom {

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "John";
        s1.age = 18;
        s1.height = 170.0;
        s1.weight = 60.0;

        s2.name = "Mary";
        s2.age = 17;
        s2.height = 162.5;
        s2.weight = 48.5;

        System.out.printf("姓名:%s 年齡:%d 身高:%.1f 體重:%.1f \n" ,s1.name, s1.age, s1.height, s1.weight);

        System.out.println("姓名:" + s2.name + " 年齡:" + s2.age + " 身高:" + s2.height + " 體重:" + s2.weight);
        
        //BMI
        double s1_bmi= s1.weight/Math.pow(s1.height/100, 2);
        double s2_bmi= s2.weight/Math.pow(s2.height/100, 2);
        System.out.printf("%s 的 BMI = %.2f\n",s1.name,s1_bmi);
        System.out.printf("%s 的 BMI = %.2f\n",s2.name,s2_bmi);
        
    }
}
