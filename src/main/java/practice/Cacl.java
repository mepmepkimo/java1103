package practice;

public class Cacl {

    public static void main(String[] args) {
        Area a1 = new Area();//定義新的Area 定義a1在Area裡面
        a1.h = 100;//定義a1的h大小
        a1.w = 50;//定義a1的w大小
        //第一種無回傳值的方法,直接印出來
        a1.calcAndPrint();//將a1.h a1.w帶入到副程式裡面
        //第二種有回傳值得方法,需要印出SUM
        int x = a1.calcNotPrint();
        System.out.println(x);

        //-------------------------
        BMI bmi = new BMI();
        bmi.h = 170.0;
        bmi.w = 60.0;
        double b1 = bmi.calc();//BMI標準值
        double b2 = bmi.calc(1);//BMI男生的判斷
        double b3 = bmi.calc(2);//BMI女生的判斷
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

    }

}
