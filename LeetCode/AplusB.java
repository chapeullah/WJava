package LeetCode;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class AplusB {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        
        String[] Input = reader.readLine().split(" ");
		Long A = Long.parseLong(Input[0]);
		Long B = Long.parseLong(Input[1]);
		BigInteger sum = BigInteger.valueOf(A + B);
        writer.write(String.valueOf(sum));

        reader.close();
        writer.close();
    }
    public int i;
}