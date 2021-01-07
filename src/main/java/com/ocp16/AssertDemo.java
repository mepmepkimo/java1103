
package com.ocp16;

import java.util.Random;

public class AssertDemo {
    public static void main(String[] args) {
        int x = new Random().nextInt(100);
        //假設X都要應該大於等於>=60 (執行JAVA -ea)
        assert(x>=60 ) : "發生Assert錯誤,挑戰失敗,x="+x;
        System.out.printf("%d大於等於>=60 正確\n",x);
    }
    
}
