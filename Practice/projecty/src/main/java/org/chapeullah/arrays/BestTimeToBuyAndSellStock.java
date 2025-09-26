package org.chapeullah.arrays;

public class BestTimeToBuyAndSellStock {

    public static int bestTimeToBuyAndSellStock(int[] nums) {
        int min = nums[0], profit = 0;
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(nums[i], min);
            profit = Math.max(profit, nums[i] - min);
        }
        return profit;
    }

}
