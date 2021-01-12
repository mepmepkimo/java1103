
package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class News implements Subject{
    private  List<Observer> observers = new ArrayList<>();//我的粉絲列表(人數)

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyOberver(String data) {
        observers.stream().forEach(o->o.update(data));
    }
    
    
}
