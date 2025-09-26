package org.chapeullah.problems;

public class RemoveDuplicates {

    public static String removeDuplicates(String input) {
        StringBuilder temp = new StringBuilder();
        char prev = input.charAt(0);
        temp.append(prev);
        for (int i = 1; i < input.length(); ++i) {
            char curr = input.charAt(i);
            if (Character.toLowerCase(curr) != Character.toLowerCase(prev)) {
                temp.append(curr);
                prev = curr;
            }
        }
        return temp.toString();
    }

}
