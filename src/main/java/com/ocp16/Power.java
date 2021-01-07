package com.ocp16;
//電力換算
//V電壓 W瓦數 A電流

public class Power {

    public int getV(int w, int a) {
        int v = w / a;
        return v;
    }

    public int getA(int v, int w) {
        int a = w / v;
        return a;
    }
    
        public int getW(int v, int a) {
        int w = a * v;
        return w;
    }

}
