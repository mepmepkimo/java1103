package ocp16;

import com.ocp16.Power;
import org.junit.Assert;
import org.junit.Test;

public class Test_Power {

    @Test
    public void test() {
        Power power = new Power();
        int w = 1000;//1000瓦
        int a = 100;//100安培
        int exp = 10;//10 電壓
        int act = power.getV(w, a);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test2() {
        Power power = new Power();
        int v = 10;//1000電壓
        int a = 100;//100安培
        int exp = 1000;//10 瓦
        int act = power.getW(v, a);
        Assert.assertEquals(exp, act);
    }

    @Test
    public void test3() {
        Power power = new Power();
        int v = 10;//1000瓦
        int w = 1000;//100安培
        int exp = 100;//10 電壓
        int act = power.getA(v, w);
        Assert.assertEquals(exp, act);
    }

}
