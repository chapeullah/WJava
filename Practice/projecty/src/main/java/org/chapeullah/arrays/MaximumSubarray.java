package org.chapeullah.arrays;

public class MaximumSubarray {

    public static int maximumSubarray(int[] nums) {
        int curr = nums[0], best = curr;
        for (int i = 1; i < nums.length; ++i) {
            curr = Math.max(nums[i], curr + nums[i]);
            best = Math.max(best, curr);
        }
        return best;
    }

}
