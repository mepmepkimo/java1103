
package com.ocp32;

import java.io.File;
import java.nio.file.Files;
import java.util.Arrays;

public class DeleteFile1 {
    public static void main(String[] args) {
        File files=new File("src\\main\\java\\com\\ocp32\\Files");
        if(files.exists()){
            //印出files 內的內容(檔案s或資料夾s名稱)
            System.out.println(Arrays.toString(files.list()));
            //刪除temp 為首的檔案
            for(String fname :files.list()){
                if(fname.contains("temp")){
                    File delFile= new File(files.getPath()+File.separator+fname);
                    delFile.delete();
                }
            }
            System.out.println(Arrays.toString(files.list()));
        }else{
            System.out.printf("%s 不存在\n",files);
            
            }
        }
    }
    

