package practice2;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        Account ac1 = null;
        atm_loop://迴圈名稱
        do{
            System.out.println("--------------");
            System.out.println("1: 建立新帳戶");
            System.out.println("2: 存款");
            System.out.println("3: 提款");
            System.out.println("4: 查詢");
            System.out.println("9: 離開");
            System.out.println("--------------");
            Scanner sc= new Scanner(System.in);
            System.out.println("請選擇(1~9)");
            
            int no = sc.nextInt();
            
            
        }

    }

}
