package com.ocp12.stream1;

import java.util.stream.Stream;

public class StringStream2 {

    public static void main(String[] args) {
        String[] names = {"Java", "Python", "C", "Visul Basic"};
        //印出字串長度<=4的NAME
        //before java8
        for (String x : names) {
            if (x.length() <= 4) {
                System.out.println(x);
            }
        }
        //java8
        Stream.of(names)
                .filter(x ->x.length() <=4)
                .forEach(System.out::println);

    }

}
