package LeetCode;

public class RomanToInt {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            char chBefore = (i != s.length() - 1) ? s.charAt(i + 1) : s.charAt(i);
            switch (ch) {
                case 'I' -> {
                    if (chBefore == 'V' || chBefore == 'X') {
                        result -= 1;
                    }
                    else {
                        result += 1;
                    }
                }
                case 'V' -> {
                    result += 5;
                }
                case 'X' -> {
                    if (chBefore == 'L' || chBefore == 'C') {
                        result -= 10;
                    }
                    else {
                        result += 10;
                    }
                }
                case 'L' -> {
                    result += 50;
                }
                case 'C' -> {
                    if (chBefore == 'D' || chBefore == 'M') {
                        result -= 100;
                    }
                    else {
                        result += 100;
                    }
                }
                case 'D' -> {
                    result += 500;
                }
                case 'M' -> {
                    result += 1000;
                }
            }
        }
        return result;
    }
}
