
package com.ocp32.Files;

public class ExceptionMessage {
    public static void main(String[] args) {
        try{
            System.out.println(10/0);
        }catch(Exception e){
            System.out.println(e);
            System.out.println();
            e.printStackTrace(sout);
        }
    }
    
}
