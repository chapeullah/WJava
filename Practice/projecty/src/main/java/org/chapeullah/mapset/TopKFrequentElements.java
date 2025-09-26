package org.chapeullah.mapset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {

    public static int[] topKFrequentEmelements(int[] nums, int k) {
        int[] result = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }

        return result;
    }

}
