//package com.ocp31_db.drink;
//
//import java.util.Scanner;
//
//public class DrinkStore {
//
//    public static boolean exit;
//
//    public static void main(String[] args) {
//        while (!exit) {
//            menu();
//        }
//    }
//
//    public static void menu() {
//        System.out.println("-------------");
//        System.out.println("1. Read");
//        System.out.println("2.Creat");
//        System.out.println("3.Update amount");
//        System.out.println("4.Delete");
//        System.out.println("5.Exit");
//        System.out.println("-------------");
//    }
//
//    public static void service() {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("===>");
//        int n = sc.nextInt();
//        switch (n) {
//            case 1:
//                dao.read();
//                break;
//            case 2:
//                System.out.println("Please input drink name: ");
//                String name = sc.next();
//                System.out.println("Please input drink price: ");
//                int price = sc.nextInt();
//                System.out.println("Please input drink amount: ");
//                int amount = sc.nextInt();
//                dao.create(name,price,amount);
//                break;
//            case 3:
//                System.out.println("Please input update ID: ");
//                int updateID= sc.nextInt();
//                System.out.println("Please input drink amount for update");
//int updateAmount = sc.nextInt();
//dao.update(updateID)
//                break;
//            case 4:
//
//                break;
//            case 5:
//
//                exit = true;
//        }
//    }
//
//}
