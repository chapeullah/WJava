package LeetCode;

public class ContainsValue {
    public static boolean check(Object[] a, Object x) {
        for (Object obj : a) {
            if (x.equals(obj)) {
                return true;
            }
        }
        return false;
    }
}
