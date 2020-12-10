package com.ocp11.case4_方法內部類別;

public class Bar {

    public void hello() {
        int x = 100;//在JAVA8之後可以不用加FINAL
        x++;
        int y = 99;
        
        class Foo {

            void printMe() {
                System.out.println("i am Foo");
                //若要存取hello()外部方法的區域變數
                //則該變數必須是FINAL
                System.out.println(x);
            }
        }
        Foo foo = new Foo();
        foo.printMe();
    }

}
