package com.ocp31_db.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Read {

    public static void main(String[] args) throws Exception {
        //1.載入JDBC驅動程式
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        //2.建立資料庫連線
        String url = "jdbc:derby://localhost:1527/demo";//資料庫的位置
        String user = "app";
        String password = "app";
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.printf("資料庫連線是否關閉: %b\n ", conn.isClosed());
        //3.建立Statement 敘述(用來敘述撰寫SQL語法)物件
//ResultSet.TYPE_FORWARD_ONLY只能往下讀取(預設值)
//ResultSet.CONCUR_READ_ONLY只能讀不能改(預設值)
//一般多用於查詢使用
//Statement stmt= conn.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
        Statement stmt = conn.createStatement();
//4.取得查詢結果的集合 ResultSet (須配合SQL)
        String sql = "SELECT d.ID, d.\"NAME\", d.PRICE, d.AMOUNT, d.TDATE FROM APP.DRINK d";
        ResultSet rs = stmt.executeQuery(sql);
        //5.走訪 ResultSet資料集合
System.out.printf("----------------------|\n");
        ResultSetMetaData md = rs.getMetaData();
        System.out.printf("|%-2s|%-10s|%-6s|%-6s|%-12s|",
        md.getColumnName(1),
        md.getColumnName(2),
        md.getColumnName(3),
        md.getColumnName(5),
        md.getColumnName(5));
        System.out.printf("----------------|\n");
        //6.走訪ResultSet資料集合
        while (rs.next()) {
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int price = rs.getInt("price");
            int amount = rs.getInt("amount");
            Date tdate = rs.getDate("tDate");

            System.out.printf("%d %s %d %d %s\n", id, name, price, amount, tdate);
        }

        conn.close();
    }

}
