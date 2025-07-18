package LeetCode;

import java.util.List;
import java.util.ArrayList;

public class FriendsFilter {
    public static List<String> friend1(List<String> x){
        List<String> result = new ArrayList<>();
        for (String str : x) {
            if (str.length() == 4) {
                result.add(str);
            }
        }
        return result;
    }

    public static List<String> friend2(List<String> x) { // Этот вариант доступен с Java 16
        return x.stream().filter(str -> str.length() == 4).toList();
    }
}
