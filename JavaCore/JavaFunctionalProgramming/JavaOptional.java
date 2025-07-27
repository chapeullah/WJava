package JavaCore.JavaFunctionalProgramming;

import java.util.Optional;

import Practice.OOP.Model.Cat;

public class JavaOptional {
    public static void main(String[] args) {
        findUser("Denis");

        Optional.ofNullable(null)
            .ifPresentOrElse(value -> System.out.println("Sending email to " + value), () -> System.out.println("Bye"));
    }

    private static Optional<Cat> findUser(String name) {
        Cat cat = new Cat();
        return Optional.ofNullable(cat);
    }
}
