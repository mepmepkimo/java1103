
package com.ocp24_excutor;

import java.util.Random;

public class Lotto implements Runnable{

    @Override
    public void run() {
        int n = new Random().nextInt(100);
        System.out.println(n);
    }
    
    
}
