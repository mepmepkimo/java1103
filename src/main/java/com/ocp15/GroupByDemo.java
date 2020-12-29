package com.ocp15;
//群組 GroupBy , 數量 Count , 排序 Sort

import com.sun.org.apache.xml.internal.security.transforms.implementations.TransformC14NExclusiveWithComments;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDemo {

    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "apple", "banana",
                "apple", "banana", "watermelon", "orange");
        //分組
        Map<String, Long> result = fruits.stream().collect(collector.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);

        //排序
        result.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .forEach(e -> System.out.println(e));
        
        result.entrySet().stream().sorted((a,b)->)
        

    }
}
