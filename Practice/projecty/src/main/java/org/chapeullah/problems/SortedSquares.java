package org.chapeullah.problems;

public class SortedSquares {

    public static int[] sortedSquares(int[] sortedNums) {
        int n = sortedNums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1, index = n - 1;
        while (left <= right) {
            int leftSq = sortedNums[left] * sortedNums[left];
            int rightSq = sortedNums[right] * sortedNums[right];
            if (leftSq > rightSq) {
                ++left;
                result[index--] = leftSq;
            }
            else {
                --right;
                result[index--] = rightSq;
            }
        }
        return result;
    }

}
