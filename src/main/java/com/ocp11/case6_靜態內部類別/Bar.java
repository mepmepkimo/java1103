package com.ocp11.case6_靜態內部類別;

public class Bar {
    //靜態內部類別
    //可以有STATIC成員與INSTANCE成員

    public static class Foo {

        public static void printMe() {
            System.out.println("I am Foo");
        }

        public void hello() {
            System.out.println("I am Hello");
        }
    }

    //一般內部類別
    //只能有INSTANCE成員
    public class Hoo {

        public void hello() {
            System.out.println("I am Hello");;
            Foo.printMe();
        }
    }
}
