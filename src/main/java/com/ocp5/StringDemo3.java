
package com.ocp5;

public class StringDemo3 {
    public static void main(String[] args) {
        String s1 = new String("Java");
        s1=s1.concat("8");
        System.out.println(s1);
        StringBuilder sb= new StringBuilder("Java");
        sb.append("8");
        System.out.println(sb);//sb.String()
        //如何比較s1與??
        System.out.println(s1.equals(sb.toString()));//在sb.後面加上toString 把他家到STRING POOL裡面
        System.out.println(s1.intern()==sb.toString().intern());//因為第6行不是再STRING POOL裡面所以要把S1放到STRINGPOOL裡面 所以兩邊都要加上.intern
    }
    
}
