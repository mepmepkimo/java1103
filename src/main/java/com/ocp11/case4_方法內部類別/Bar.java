package com.ocp11.case4_方法內部類別;

public class Bar {

    int x =1000;

    public void hello() {
        
        final int x = 100;
        //x++;
        class Foo {

            void PrintMe() {
                System.out.println("I am Foo");
                //若要存取hello()外部方法的區域變數
                //則該便是必須是 FINAL
                System.out.println(x);
                
            }
            
        }
        Foo foo = new Foo();
        foo.PrintMe();

    }

}
