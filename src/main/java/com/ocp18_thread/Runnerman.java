package com.ocp18_thread;

public class Runnerman {

    public static void main(String[] args) {
        Runner r1 = new Runner();
        Runner r2 = new Runner();
        r1.setName("烏龜");
        r2.setName("兔子");
        r2.setDaemon(true);
        r1.setDaemon(true);
        r1.setPriority(Thread.MAX_PRIORITY);//1-10
        r1.setPriority(Thread.MAX_PRIORITY);//1-10

        r1.start();//啟動執行續
        r2.start();//啟動執行續
        for (int i = 0; i < 10; i++) {
            System.out.println(i);

        }
    }

}
