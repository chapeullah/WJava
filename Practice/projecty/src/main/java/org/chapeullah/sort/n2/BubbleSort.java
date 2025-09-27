package org.chapeullah.sort.n2;

public class BubbleSort {

    public static int[] bubbleSort(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n - 1; ++i) {
            boolean swaped = false;
            for (int j = 0; j < n - i - 1; ++j) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                    swaped = true;
                }
            }
            if (!swaped) break;
        }
        return nums;
    }

}
