
package com.ocp19_thread;

public class LuckyNumber extends Thread{
private  static final int LUCKY_NUMBER=777;
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 1; true; i++) {
        int number = (int)(Math.random()*1000);    
        if (number ==777){
            System.out.println("%s 總共取 %d 次取到 %d\n");
            break;
        }
        }
        
    }
    
    
}
