package LeetCode;

public class RemoveChars {
    public static String remove(String str) {
        if (str.length() == 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }
}