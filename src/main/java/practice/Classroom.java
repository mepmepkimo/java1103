package practice;

public class Classroom {

    public static void main(String[] args) {
        //建立學生物件
        Student s1 = new Student();
        Student s2 = new Student();
        //定義學生屬性
        s1.name = "John";
        s1.age = 18;
        s1.height=170.0;
        s1.weight=60.0;
        s2.name = "Mary";
        s1.age = 17;
        s1.height=162.5;
        s1.weight=48.5;
        //印出學生屬性
        System.out.printf("姓名:%s 年齡:%d 身高:%.1f 體重:%.1f ", s1.name,s1.age,s1.height,s1.weight);
        System.out.printf("姓名:%s 年齡:%d 身高:%.1f 體重:%.1f ", s2.name,s2.age,s2.height,s2.weight);
        
        

    }

}
