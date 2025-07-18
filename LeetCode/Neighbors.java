package LeetCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Neighbors {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] input = reader.readLine().split(" ");
        int[] nums = new int [input.length];
        int result = 0;
        for (int i = 0; i < input.length; i++) nums[i] = Integer.parseInt(input[i]);
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i-1] && nums[i] > nums[i+1]) {
                result++;
            }
        }
        writer.write(String.valueOf(result));

        reader.close();
        writer.close();
    }
}