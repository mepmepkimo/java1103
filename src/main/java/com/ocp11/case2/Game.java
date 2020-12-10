package com.ocp11.case2;

public interface Game {

    void play();
    default int price() {
        return 99;
    }

    //多做一格個COPYRIGHT方法
    default void copyRight() {
        System.out.println("版權所有 ");
    }

}
