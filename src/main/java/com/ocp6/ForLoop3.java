package com.ocp6;

public class ForLoop3 {

    public static void main(String[] args) {
        int[][][] nums = {
            {{100, 90}, {80, 70}, {60, 50}},
            {{70, 90}, {80, 100}, {60, 90}},};

        int sum = 0;
        for (int[][] num : nums) {
            for (int[] nu : num) {
                for (int n : nu) {
                    System.out.println(n);
                    sum += n;
                }

            }
        }
        System.out.printf("sum=%d\n", sum);
        //starfard for loop
        for (int i = 0; i < nums.length; i++) {
            int[][] num = nums[i];
            for (int j = 0; j < num.length; j++) {
                int[] nu = num[j];
                for (int k = 0; k < nu.length; k++) {
                    int n = nu[k];
                    System.out.println(n);
                    sum+=n;
                    
                    
                }
                
            }
            
        }
        System.out.printf("sum=%d\n",sum);
    }
}
