
package com.ocp14;
//Vector是執行緒安全(多人存取安全)的集合

import java.util.Vector;


public class VectorDemo {
    public static void main(String[] args) {
        Vector v = new Vector(81,5);
        for(int i =1;i<=11;i++){
            v.add(i);
        }
        v.add(100);
        System.out.println("Capacity: "+v.capacity());
        System.out.println("Size: "+v.size());
    }
    
}
