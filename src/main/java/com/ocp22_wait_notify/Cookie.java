
package com.ocp22_wait_notify;

public class Cookie {
    //吃餅乾
    public void eat(int no){
       String name = Thread.currentThread().getName();
        System.out.printf("%s 吃了第 %d塊餅乾",name,no);
        
    }
    //放餅乾
        public void put(int no){
       String name = Thread.currentThread().getName();
        System.out.printf("%s 放了第 %d塊餅乾",name,no);
        
    }
}
