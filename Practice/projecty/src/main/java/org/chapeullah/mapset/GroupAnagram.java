package org.chapeullah.mapset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {

    public static List<List<String>> groupAnagram(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; ++i) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted =  new String(chars);

            List<String> list = map.getOrDefault(sorted, new ArrayList<>());
            list.add(strs[i]);
            map.put(sorted, list);
        }
        return new ArrayList<>(map.values());
    }

}
