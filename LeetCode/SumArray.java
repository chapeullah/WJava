package LeetCode;

public class SumArray {
    public static double sum(double[] numbers) {
        double sum = 0;
        for (double d : numbers) {
            sum += d;
        }
        return sum;
    }
}
