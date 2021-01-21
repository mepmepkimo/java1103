
package com.ocp22_wait_notify;

public class Put implements Runnable{
    private Cookie cookie;

    public Put(Cookie cookie) {
        this.cookie = cookie;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            cookie.put(i);
            
        }
    }
    
    
}
