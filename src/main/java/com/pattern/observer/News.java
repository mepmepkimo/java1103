
package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class News implements Subject{
    private  List<Obsever> obsever = new ArrayList<>();//我的粉絲列表(人數)

    @Override
    public void add(Obsever obsever) {
        observers.add(observer);
    }

    @Override
    public void remove(Obsever obsever) {
        observers.remove(observer);
    }

    @Override
    public void notifyOberver(Obsever obsever) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
