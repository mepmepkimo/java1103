package com.ocp16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {

    public static void main(String[] args) {
        play();
    }

    public static void play() {
        int x = 10;
        Scanner sc = new Scanner(System.in);

        System.out.println(
                "假設分子是 10 請輸入分母 : ");
        try {
            int y = sc.nextInt();//可能會發生 InputMismatchException 的例外
            int result = x / y;
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("輸入類型與預期不同,請輸入數字");
            System.out.println("錯誤類型 :" + e);
            System.out.println("錯誤原因 :" + e.getMessage());
            play();
        } catch (ArithmeticException ae) {
            System.out.println("分母不可為0");
            System.out.println("錯誤類型 :" + ae);
            System.out.println("錯誤原因 :" + ae.getMessage());
            play();
        }

    }

}

