package LeetCode;

import java.util.List;
import java.util.ArrayList;

class LargeGroupPositions {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list = new ArrayList<>();
        int count = 1;
        for (int i = 1; i < s.length(); ++i) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                if (count >= 3) {
                    List<Integer> group = new ArrayList<>();
                    group.add(i - count);
                    group.add(i - 1);
                    list.add(group);
                }
                count = 0;
            } else if (i == s.length() - 1 && count >= 2) {
                List<Integer> group = new ArrayList<>();
                group.add(i - count);
                group.add(i);
                list.add(group);
            }
            ++count;
        }
        return list;   
    }
}