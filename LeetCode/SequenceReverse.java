package LeetCode;

import java.util.Arrays;

public class SequenceReverse {
    public static int[] reverse(int n) {
        int temp = n;
        int[] result = new int[n];
        for (int i = 0; i < n; ++i) {
            result[i] = temp;
            --temp;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }
}
