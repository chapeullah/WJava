package LeetCode;

class IsThree {
    public boolean isThree(int n) {
        int result = 0;
        for (int i = 1; i <= n; ++i) {
            if (n % i == 0) 
            {
                System.out.println(n % i);
                ++result;
            }
        }
        return result == 3;
    }
}