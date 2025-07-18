package JavaCore;

public class JavaVarargs {
    public static void main(JavaString[] args) {
        System.out.println(average());
    } 

    static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    static double add(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum;
    }

    static double average(double... numbers) {
        if (numbers.length == 0) {
            return Double.NaN;
        }   
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }
}