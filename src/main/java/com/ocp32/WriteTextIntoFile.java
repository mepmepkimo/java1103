
package com.ocp32;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteTextIntoFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\MB-207\\Documents\\NetBeansProjects\\java1103\\src\\main\\java\\com\\ocp32\\Files\\data.txt");
        FileWriter fw = null;
        try{
            fw = new FileWriter(file);
            fw.write("Hello World");
            System.out.println("寫檔成功");
        }catch(Exception e){
        }finally{
            try {
                fw.close();
            } catch (Exception ex) {
                
            }
        }
    }
    
}
