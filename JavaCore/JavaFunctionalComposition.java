public class JavaFunctionalComposition {
    private static boolean startsWithA(String text) {
        return text != null && text.startsWith("A");
    }

    private static boolean endsWithX(String text) {
        return text != null && text.endsWith("x");
    }

    public static boolean startsWithAAndEndWithX(String text, Function<String, Boolean> first, Function<String, Boolean> seconds) {
        return first(text) && second(text);
    }

    public static void main(String[] args) {
        String text = "A codex";
        System.out.println(startsWithAAndEndWithX(text, startsWithA, endsWithX));
    }

}
