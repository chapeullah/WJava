package JavaCore.JavaFunctionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

/*
 * FUNCTION
 */

public class _Function {
    public static void main(String[] args) {
        int increment1 = increment(0);
        System.out.println(increment1);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10Function = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10Function.apply(5));
        System.out.println(addBy1AndThenMultiplyBy10(5));
        System.out.println();

        // BiFunction
        System.out.println(incrementByOneAndMultiply(4, 100));
        System.out.println();
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4, 100));
    }

    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int increment(int number) {
        return ++number;
    }

    static int multiply(int number) {
        return number * 10;
    }

    static int addBy1AndThenMultiplyBy10(int number) {
        return multiply(increment(number));
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction = 
        (numberToIncrement, numberToMultiply) -> (numberToIncrement + 1) * numberToMultiply;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
