package JavaCore.JavaExceptions;

public class JavaThrows {
    public static void main(String[] args) throws Exception {
        int x = 0;
        check(x);
        System.out.println("Привет");
    }

    public static void check(int x) throws Exception {
        if (x <= 0) {
            throw new Exception("Значение не может быть меньше нуля");
        }
    }
}
