package com.ocp4;


public class ArrayDemo {

    public static void main(String[] args) {
        double[] height = {172, 168, 164, 170, 176};
        double[] weight = {62, 57, 58, 64, 64};
        //算出身高總和
        double h_sum = getSum(height);
        //送出體重總和
        double w_sum = getSum(weight);

        System.out.printf("%.1f,%.1f\n", h_sum, w_sum);
        //算出身高平均
        double h_avg = getAvg(height);
        //算出體重平均
        double w_avg = getAvg(weight);
        System.out.printf("%.1f,%.1f\n", h_avg, w_avg);

        //算出BMI平均
        double bmi_avg = getBMIAvg (height,weight);
        System.out.printf("BMI平均: %.2f\n", bmi_avg);
    }

    public static double getBMIAvg(double [] h_array, double[] w_array) {
        if (h_array.length != w_array.length) {
            System.out.println("資料長度不一致");
            return 0.0;
        }
        double bmi_sum =0;
        int len = h_array.length;
        //因為 h_array 與 w_array的長度是相同的，所以可以共用i值
        for(int i =0; i<h_array.length;i++){
            double h = h_array[i];
            double w = w_array[i];
            double bmi = w/Math.pow(h/100,2);
            bmi_sum += bmi;
        }
        return bmi_sum/len;
    }

    public static double getSum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double getAvg(double[] array) {
        double sum = getSum(array);
        return sum / array.length;

    }

}

