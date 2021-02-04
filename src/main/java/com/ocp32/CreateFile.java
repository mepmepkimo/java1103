
package com.ocp32;

import java.io.File;
import java.nio.file.Files;

public class CreateFile {
    public static void main(String[] args) {
        String path="src\\main\\java\\com\\ocp32\\Files";
        String fname ="salary.csv";
        File file= new File(path +File.separator+fname);
        if(file.exists()){
            System.out.printf("%s 檔案已存在\n",file);
        }else{
            System.out.printf("建立%s檔案:",file);
            try {
                if (file.createNewFile()) {
                    System.out.println("成功");
                    
                }else{
                    System.out.println("失敗");
                }
                
            } catch (Exception e) {
                System.out.printf("錯誤: %s",e);
            }
        }
    }
    
}
