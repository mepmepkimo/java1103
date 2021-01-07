
package com.pattern.observer;


public class Test {
    public static void main(String[] args) {
        Subject news = new News();
        Obsever user1= new User("小明");
        Obsever user1= new User("小華");
        Obsever user1= new User("小英");
        //訂閱
        news.add(user1);
        news.add(user2);
        news.add(user3);
        //發送新聞
        news.notifyOberver("最近今天很冷");
        //退訂
        news.remove(user2);
        //發送新聞
        news.notifyOberver("明天下雪~~\n");
    }
    
}
