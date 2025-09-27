package org.chapeullah.sort.n2;

public class SelectionSort {

    public static int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; ++i) {
            int min = i, temp;
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
        return nums;
    }

}
