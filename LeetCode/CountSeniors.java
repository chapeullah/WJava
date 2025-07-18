package LeetCode;

class CountSeniors {
    public int countSeniors(String[] details) {
        int result = 0;
        for (String str : details) {
            if (Integer.parseInt(str.substring(11, str.length() - 2)) > 60) ++result;
        }
        return result;
    }
}