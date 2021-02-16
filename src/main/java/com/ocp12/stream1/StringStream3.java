package com.ocp12.stream1;

import java.util.stream.Stream;

public class StringStream3 {

    public static void main(String[] args) {

        String[] names = {"Java", "Python", "C", "Visual Basic"};
        //印出每個字串長度的總和
        //4,6,1,12=23
        int sum = Stream.of(names).mapToInt(x -> x.length()).sum();
        System.out.println(sum);
        //印出字串長度 <=4的長度各是多少?
        Stream.of(names)
                .mapToInt(x -> x.length())
                .filter(x -> x <= 4)
                .forEach(x -> System.out.println(x));

        Stream.of(names)
                .mapToInt(String::length)
                .filter(Util::isLessThan4)
                .forEach(System.out::println);

    }

}
