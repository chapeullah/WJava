package LeetCode;

public class TotalPoints {
    public static int points(String[] games) {
        int points = 0;
        for (String game : games) {
            char x = game.charAt(0);
            char y = game.charAt(2);
            if (x > y) {
                points += 3;
            }
            else if (x == y) {
                ++points;
            }
        }
        return points;
    }
}
