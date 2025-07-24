package JavaCore.JavaFunctionalProgramming;

import java.util.function.Function;

public class JavaFunctionalComposition {
    private static boolean startsWithA(String text) {
        return text != null && text.startsWith("A");
    }

    private static boolean endsWithX(String text) {
        return text != null && text.endsWith("x");
    }

    public static boolean startsWithAAndEndWithX(String text) {
        return startsWithA(text) && endsWithX(text);
    }

    public static boolean composeAnd(
        String text, 
        Function<String, Boolean> first, 
        Function<String, Boolean> second
    ) {
        return first.apply(text) && second.apply(text);
    }

    public static void main(String[] args) {
        String text = "A codex";
        Function<String, Boolean> startsWithA = t -> t.startsWith("A");
        Function<String, Boolean> endsWithX = t -> t.endsWith("x");
        System.out.println(startsWithAAndEndWithX(text));
        System.out.println(composeAnd(text, startsWithA, endsWithX));
    }

}
