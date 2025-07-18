package LeetCode;

public class JadenCase {
    public String toJadenCase(String phrase) {
		if (phrase == null || phrase.trim().isEmpty()) {
            return null;
        }
        char[] phraseChars = phrase.toCharArray();
        for (int i = 0; i < phraseChars.length; ++i) {
            if (i == 0 || phraseChars[i - 1] == ' ') {
                phraseChars[i] = Character.toUpperCase(phraseChars[i]);
            }
        }
		return new String(phraseChars);
	}
}
