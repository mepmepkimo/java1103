
package com.pattern.observer;
//被觀察者(主題,youtuber)
public interface Subject {
    void add(Obsever obsever);
    void remove(Obsever obsever);
    void notifyOberver(Obsever obsever);
    
}
