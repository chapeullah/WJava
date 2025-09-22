package org.chapeullah.strings;

import java.util.HashMap;

public class FirstUniqueCharacter {

    public static int firstUniqueCharacter(String string) {

        char[] chars = string.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < chars.length; ++i) {
            if (map.get(chars[i]).equals(1)) {
                return i;
            }
        }
        return -1;

    }

}
