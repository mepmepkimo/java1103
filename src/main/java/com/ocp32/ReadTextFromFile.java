package com.ocp32;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.Date;

public class ReadTextFromFile {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\MB-207\\Documents\\NetBeansProjects\\java1103\\src\\main\\java\\com\\ocp32\\Files\\data.txt");

        //使用try-catch-resource 的語法
        try (Reader r = new FileReader(file)) {
            int data = 0;
            String allData= "";
            while ((data = r.read()) != -1) {//得到-1為檔尾
                System.out.print((char) data);
                
            }System.out.printf("檔案內容 : %s\n", allData);

        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}
