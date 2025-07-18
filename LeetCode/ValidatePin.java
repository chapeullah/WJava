package LeetCode;

public class ValidatePin {
    public static boolean validatePin(String pin) {
        if (pin.isEmpty() || (pin.length() != 4 && pin.length() != 6)) {
            return false;
        }
        for (int i = 0; i < pin.length(); ++i) {
            if (!Character.isDigit(pin.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
