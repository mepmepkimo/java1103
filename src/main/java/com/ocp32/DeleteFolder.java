
package com.ocp32;

import java.io.File;
import java.nio.file.Files;

public class DeleteFolder {
    public static void main(String[] args) {
        File files = new File ("src\\main\\java\\com\\ocp32\\Files");
        if(files.exists()){
            //刪除資料夾
            if(files.delete()){
                System.out.printf("%s 刪除成功\n",files);
            }else{
                System.out.printf("%s 刪除失敗\n",files);
            }
        }else{
            System.out.printf("%s 不存在\n",files);
        }
    }
    
}
