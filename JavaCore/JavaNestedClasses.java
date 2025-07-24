package JavaCore;

public class JavaNestedClasses {
    
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
