package LeetCode;

class TotalMoney
{
    public int totalMoney(int n) 
    {
        int result = 0, temp = 0, monday = 1;
        for (int i = 1; i <= n; ++i)
        {
            if (temp == 7) 
            {
                temp = 0;
                ++monday;
            }
            result += temp + monday;
            ++temp;
        }
        return result;
    }
}