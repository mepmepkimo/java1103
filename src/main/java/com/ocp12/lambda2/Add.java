
package com.ocp12.lambda2;

@FunctionalInterface
public interface Add {
    int sum(int x,int y,int z);
    public int hashCode();    //公用方法<<<這行不要留也可以RUN
    default void copyright(){   //default 有時做的方法<<<這行不要留也可以RUN
        
    }
}
