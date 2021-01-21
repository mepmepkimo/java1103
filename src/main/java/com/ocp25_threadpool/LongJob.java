
package com.ocp25_threadpool;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LongJob implements Runnable{

    @Override
    public void run() {
        System.out.println("長工作任務");
        try {
            TimeUnit.SECONDS.sleep(5);//相當於THREAD.SLEEP(5000);
        } catch (Exception e) {          
        }
        System.out.println("常工作任務-結束");
    }
    
}
