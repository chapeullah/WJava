package org.chapeullah.arrays;

public class BestTimeToBuyAndSellStock {

    public static int bestTimeToBuyAndSellStock(int[] nums) {
        int min = nums[0], max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int temp = Math.min(min, nums[i]);
            if (temp != min) {
                max = temp;
            }
            else
        }
    }

}
