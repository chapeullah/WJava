package org.chapeullah.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class ProductOfArrayExceptSelf {

    public static int[] productOfArrayExceptSelf(int[] nums) {
        int length = nums.length, right = 1;
        int[] res = new int[length];
        res[0] = 1;
        for (int i = 1; i < length; ++i) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        for (int i = length - 1; i >= 0; i--) {
            res[i] = res[i] * right;
            right = right * nums[i];
        }
        return res;
    }

}
