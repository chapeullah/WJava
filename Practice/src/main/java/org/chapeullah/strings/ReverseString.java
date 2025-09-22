package org.chapeullah.strings;

public class ReverseString {

    public static String reverseString(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            result.append(string.charAt(i));
        }
        return result.toString();
    }

}
