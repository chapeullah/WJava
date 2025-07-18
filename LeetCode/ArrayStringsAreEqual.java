package LeetCode;

class ArrayStringsAreEqual {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String string1 = new String(), string2 = new String();
        for (String str : word1) {
            string1 += str;
        }
        for (String str : word2) {
            string2 += str;
        }
        if (string1.equals(string2)) {
            return true;
        }
        return false;
    }
}