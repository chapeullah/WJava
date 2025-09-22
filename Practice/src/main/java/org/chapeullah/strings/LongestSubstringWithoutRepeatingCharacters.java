package org.chapeullah.strings;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int longestSubstringWithoutRepeatingCharacters(String string) {
        int left = 0, max = 0, temp = 0, length = string.length();
        HashSet<Character> set = new HashSet<>();
        char[] chars = string.toCharArray();
        for (int i = 0; i < length; i++) {
            while (set.contains(chars[i])) {
                set.remove(chars[left++]);
                --temp;
            }
            set.add(chars[i]);
            max = Math.max(++temp, max);
        }
        return max;
    }

}
