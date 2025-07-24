package JavaCore;

@FunctionalInterface
public interface JavaFunctionalInterface {

    void run();

    default void speak() {
        System.out.println("Someone speak");
    }

}
