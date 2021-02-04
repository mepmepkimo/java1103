
package com.ocp32;
//建立資料夾.../OCP32_io/files 資料夾

import java.io.File;
import java.io.IOException;

public class CreatFolder {
    public static void main(String[] args) {
        String path = "src\\main\\java\\com\\ocp32";
        File folder = new File(path);
        //確認folder 是否是資料夾
        if(folder.isDirectory()){
            //建立 files 資料夾
            //File files = new File(folder.getPath()+"/"+"Files");
            //folder.getpath() -> src\\main\\java\\com\\ocp32
            //file.spearator -> "\\"
            File files = new File("src\\main\\java\\com\\ocp32\\Files");
        //確認files是否已經被建立
            if (files.exists()) {
                System.out.printf("%s 目錄已經被建立\n",files);
            }else{
                System.out.printf("建立%s 目錄\n",files);
               
                    boolean check = files.mkdir();
                    if(check){
                        System.out.println("成功");
                    }else{
                        System.out.println("失敗");
                    }
                    
                
                    
                
            }
        }else{
            System.out.printf("$s 不是資料夾\n",folder);
        }
        
    }
    
}
