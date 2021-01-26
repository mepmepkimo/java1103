
package com.ocp29_callback;

public class ScoreMain {
    private static int sum= 0;
    public static void main(String[] args) {
        Callback cb = (n)->System.out.println("主程式得到: %d\n",n);
        
        System.out.println("工作開始");
        Thread t1 = new Thread(new Score(cb));
        t1.start();              
               
        System.out.println("等待結果...");
    }
    
}
