package LeetCode;

import java.util.ArrayList;

public class CountPassengers {
    public static int countPassengers(ArrayList<int[]> stops) {
        int result = 0;
        for (int[] pair : stops) {
            result += pair[0];
            result -= pair[1];
        }
        return result;
    }
}
