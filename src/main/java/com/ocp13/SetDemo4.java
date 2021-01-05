//package com.ocp13;
//
//import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
//import java.util.LinkedHashSet;
//import java.util.Set;
//import java.util.stream.IntStream;
//
//public class SetDemo4 {
//
//    public static void main(String[] args) {
//        Set<Exam> exams = new LinkedHashSet<>();
//        IntStream.rangeClosed(1, 20).forEach(i -> exams.add(new Exam()));
//        System.out.println("全班成績: " + exams);
//        System.out.println("1.國文平均");
//        exams.stream().mapToInt((e -> e.getChinese())).forEach(score -> System.out.print(score + ","));
//        double avg_chinese = exams.stream().mapToInt(e -> e.getChinese()).average().getAsDouble();
//        System.out.println(
//                exams.stream().mapToInt(e -> e.getChinese()).average()
//        );
//        System.out.println("2.英文平均");
//        //印出所有英文成績
//        exams.stream().mapToInt(e -> e.getEnglish()).forEach(score -> System.out.println(score + ","));
//        //計算英文平均
//        double avg_english = exams.stream().mapToInt(e -> e.getEnglish()).average().getAsDouble();
//        System.out.println("平均: " + avg_english);
//        System.out.println("3.數學平均.請同學撰寫");
//        //印出所有數學成績
//        exams.stream().mapToInt(e -> e.getMath()).forEach(score -> System.out.println(score + ","));
//        //計算數學平均
//        double avg_math = exams.stream().mapToInt(e -> e.getMath()).average().getAsDouble();
//        System.out.println("平均: " + avg_math);
//
//        System.out.println("4.國文最高分為何?");
//        int max_chinese = exams.stream()
//                .mapToInt(e -> e.getChinese())
//                .max()
//                .getAsInt();
//        System.out.println(max_chinese);
//        System.out.print("5.國文最高分的人名為何 : ");
//        exams.stream()
//                .filter(e -> e.getChinese() == max_chinese)
//                .forEach(e -> System.out.println(e.getName() + ", "));
//        System.out.println();
//        System.out.println("6.總成績最高的人名為何 : ");
//
//        int max_score = exams.stream()
//                .mapToInt(e -> e.getChinese() + e.getEnglish() + e.getMath())
//                .max()
//                .getAsInt();
//        
//        exams.stream()
//                .filter(e -> e.getChinese() + e.getEnglish() + e.getMath() == max_score)
//                .forEach(e -> System.out.println(e.getName() + ", "));
//        System.out.println(max_score);
//
//    }
//
//}
