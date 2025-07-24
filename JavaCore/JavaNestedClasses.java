package JavaCore;

public class JavaNestedClasses implements JavaFunctionalInterface {

    @Override
    public void run() {
        System.out.println("Nested class is running");
    }

    public static void main(String[] args) {
        JavaNestedClasses ourClass = new JavaNestedClasses();
        ourClass.run();
        ourClass.speak();
    }
    
    private int field = 42;

    class Inner {
        void printField() {
            System.out.println(field);
        }
    }

    enum Enum {
        ONE, TWO, THREE, FOUR, FIVE
    }

}
