package LeetCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Tags {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		int input = Integer.parseInt(reader.readLine());
        long[] nums = new long[input];
        long result = 0;
        if (input >= 1) {
            nums[0] = 1;
            result += nums[0];
        }
        if (input >= 2) {
            nums[1] = 1;
            result += nums[1];
        }
        for (int i = 2; i < input; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
            result += nums[i];
        }
        writer.write(String.valueOf(result));
        
        reader.close();
        writer.close();
    }
}
