package LeetCode;

public class VowelsCount {
    public static int getCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); ++i) {
            switch (str.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> ++count;
            }
        }
        return count;
    }
}
