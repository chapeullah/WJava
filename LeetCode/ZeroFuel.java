package LeetCode;

public class ZeroFuel {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        if (mpg * fuelLeft >= distanceToPump) {
            return true;
        }
        return false;
    }
}
