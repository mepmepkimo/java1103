
package com.ocp24_excutor;

import java.util.concurrent.Executor;

public class LottoExcutor implements Executor{

    @Override
    public void execute(Runnable command) {
        Thread t = new Thread(command);
        t.start();

    }
    
}
