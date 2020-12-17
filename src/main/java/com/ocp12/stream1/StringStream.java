
package com.ocp12.stream1;

//字串串流

import java.util.stream.Stream;

public class StringStream {
    public static void main(String[] args) {
        String[] names ={"Java","Python","C","Visul Basic"};
        //before Java 8
        //for-loop印出元素內容
        for(int i = 0 ;i<names.length;i++){
            System.out.println(names[i]);
        }
        
        //Java 8使用Stream
        //陣列轉串流
        Stream.of(names).forEach(System.out::println);
    }
    
}
