//package com.ocp28_lock;
//
//import java.util.Random;
//import java.util.concurrent.locks.ReentrantLock;
//
//class Lotto implements Runnable {
//
//    private String name;
//    private static final ReentrantLock lock = new ReentrantLock();
//
//    public Lotto(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public void run() {
//        try{
//            for (int i = 1; i <=5; i++) {
//                Thread.sleep(1000);
//                int n = new Random().nextInt(100);
//                System.out.printf("$s收到%d,%s\n",name,new Date().toString());
//                
//            }
//        }catch(Exeception e){
//            
//            
//        }finally{
//            lock.unlock();//釋放鎖
//        }
//
//    }
//
//}
