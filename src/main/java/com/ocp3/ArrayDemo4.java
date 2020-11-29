package com.ocp3;

/*
調查五位學生之身高及體重如下。
    身高：172、168、164、170、176(公分)
    體重：62、57、58、64、64(公斤)
比較其分散的程度{CV:變異係數}
 */
public class ArrayDemo4 {

    public static void main(String[] args) {
        //身高部分
        double[] h = {172, 168, 164, 170, 176};
        double h_sum = 0;
        for (int i = 0; i < h.length; i++) {
            h_sum += h[i];
        }
        double h_avg = h_sum / h.length;
        System.out.printf("身高平均: %.2f\n", h_avg);
        //平方差總和
        double h_diff_sum = 0;
        for (int i = 0; i < h.length; i++) {
            h_diff_sum += Math.pow(h[i] - h_avg, 2);
        }
        System.out.printf("身高平方差的總和: %.2f\n", h_diff_sum);
        //身高的標準差(SD)
        double h_sd = Math.sqrt((1.0 / h.length) * h_diff_sum);
        System.out.printf("身高表準差(SD): %.2f\n", h_sd);
        //身高的變異係數(CV 變異係數攻勢 : 標準差/平均)
        double h_cv = h_sd / h_avg;
        System.out.printf("身高的變異係數(CV): %.2f\n", h_cv);
        //體重部分
        double[] w = {62, 57, 58, 64, 64};
        double w_sum = 0;
        for (int j = 0; j < w.length; j++) {
            w_sum += w[j];
        }
        double w_avg = w_sum / w.length;
        System.out.printf("體重平均: %.2f\n", w_avg);
        //平方差總和
        double w_diff_sum = 0;
        for (int j = 0; j < h.length; j++) {
            w_diff_sum += Math.pow(w[j] - w_avg, 2);
        }
        System.out.printf("體重平方差的總和: %.2f\n", w_diff_sum);
        //身高的標準差(SD)
        double w_sd = Math.sqrt((1.0 / h.length) * w_diff_sum);
        System.out.printf("體重表準差(SD): %.2f\n", w_sd);
        //身高的變異係數(CV 變異係數攻勢 : 標準差/平均)
        double w_cv = w_sd / w_avg;
        System.out.printf("體重的變異係數(CV): %.2f\n", w_cv);
        System.out.println();
        System.out.printf("%s 的分散程度大\n", (h_cv > w_cv ? "身高" : "體重"));

    }

}
