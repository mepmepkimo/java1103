
package com.ocp4;

import java.util.Random;

public class RandomNumber {
     public static int[] getRandomNumber(int amount) {
        Random r = new Random();
        int[] nums = new int[amount];
        for (int i = 0; i < nums.length;) {
            int n = r.nextInt(9) + 1;
            if (!isExist(nums, n)) {
                nums[i] = n;
                i++;
            }
        }
        return nums;
    }

    public static boolean isExist(int[] nums, int n) {
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] == n) {
                return true;
            }
        }
        return false;
    }

}
