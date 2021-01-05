//package com.ocp15;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class GroupByDemo2 {
//
//    public static void main(String[] args) {
//        List<Fruit> fruits = Arrays.asList(
//                new Furit("apple"     , 10, 10),
//                new Furit("orange"    , 15, 5),
//                new Furit("apple"     , 20, 10),
//                new Furit("banana"    , 10, 15),
//                new Furit("watermelon", 10, 20),
//                new Furit("papaya"    , 15, 15),
//                new Furit("papaya"    , 20, 10),
//        );
//        //每一種水果有幾組?
//        //e->e.getName()可以寫成Fruit::getName
//        Map<String,Long> counting = fruits.stream().collect(Collectors.groupingBy(Fruit::getName,Collectors.counting()));
//        System.out.println(counting);
//        //每一種水果有幾個
//        Map<String,Integer>sum=fruits.stream()
//                .collect(collectors.groupingBy(fruits::getName, Collectors.summingInt(Fruit::getQty)));
//        System.out.println(sum);
//        
//        //根據價格來分組
//        Map<Integer,List<Furit>> groupByPrice=fruits.stream()
//                .collect(collectors.groupingBy(fruits::getPrice));
//        System.out.println(groupByPrice);
//        //根據價格來分組(水果名不可重複)
//        Map<Integer,set<String>> groupByPrice2=fruits.stream()
//                .collect(collectors.)
//        
//    }
//
//}
