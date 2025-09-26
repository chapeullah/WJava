package org.chapeullah.problems;

import java.util.Map;
import java.util.TreeMap;

public class FindDuplicates {

    public static void findDuplicates(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

}
