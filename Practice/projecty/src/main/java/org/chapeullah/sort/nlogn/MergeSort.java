package org.chapeullah.sort.nlogn;

public class MergeSort {

    public static void mergeSort(int[] nums) {
        int length = nums.length;
        if (length <= 1) return;
        int middle = length / 2;
        int[] left = new int[middle];
        int[] right = new int[middle];
        int i = 0, j = 0;
        for (; i < length; ++i) {
            if (i < middle) {
                left[i] = nums[i];
            }
            else {
                right[j] = nums[i];
                ++j;
            }
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, nums);
    }

    private static void merge(int[] left, int[] right, int[] nums) {

    }

}
