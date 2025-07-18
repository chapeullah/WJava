package LeetCode;

class CountKeyChanges {
    public int countKeyChanges(String s) {
        s = s.toLowerCase();
        char[] sCh = s.toCharArray();
        int count = 0;
        for (int i = 1; i < sCh.length; ++i) {
            if (sCh[i] != sCh[i - 1]) {
                ++count;
            }
        }
        return count;
    }
}