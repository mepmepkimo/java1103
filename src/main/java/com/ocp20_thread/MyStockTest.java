
package com.ocp20_thread;

import java.util.concurrent.FutureTask;
import yahoofinance.Stock;

public class MyStockTest {
    public static void main(String[] args) throws Exception {
        //設定商品代號
        
          String symbol = "USDTWD=x"; // 匯率
        //String symbol = "2498.TW"; // 股票
        //String symbol = "^TWII"; // 台灣加權指數
        //String symbol = "GC=F"; // 黃金期貨
        //String symbol = "CL=F"; // 原油期貨        String symbol ="CL=F";//台灣加權指數
        //建立Callable 物件(如: Mystock)
        MyStock myStock= new MyStock(symbol);
        //建立FutureTask 來執行Callable物件
        FutureTask<Stock> task = new FutureTask<>(myStock);
        //啟動執行續去執行
        new Thread(task).start();
        //接收結果
        Stock stock=task.get();
        //印出價格
        double price= stock.getQuote().getPrice().doubleValue();
        double change= stock.getQuote().getPrice().doubleValue();
        System.out.println(stock.getName());
        System.out.printf("%s ==> %.2f\n",symbol,price);
        
    }
    
}
