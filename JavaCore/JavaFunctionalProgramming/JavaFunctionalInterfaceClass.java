package JavaCore.JavaFunctionalProgramming;

public class JavaFunctionalInterfaceClass implements JavaFunctionalInterface {

    @Override
    public void run() {
        System.out.println("Class is running");
    }

    public static void main(String[] args) {
        JavaFunctionalInterfaceClass ourClass = new JavaFunctionalInterfaceClass();
        ourClass.run();
        ourClass.speak();
    }
}
