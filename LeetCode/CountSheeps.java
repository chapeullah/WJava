package LeetCode;

public class CountSheeps {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (Boolean b : arrayOfSheeps) {
            if (b == null) {
                continue;
            }
            if (b.booleanValue() == true) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Boolean[] result = {true, false, true};
        System.out.println(countSheeps(result));
    }
}
