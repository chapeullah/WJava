package JavaCore.JavaExceptions;

import JavaCore.JavaExceptions.Exception.NegativeNumberException;

public class JavaThrow {
    public static void main(String[] args) {
        try {
            check(-1);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void check(int x) throws NegativeNumberException {
        if (x < 0) {
            throw new NegativeNumberException("Значение не может быть меньше 0");
        }
    }
}
