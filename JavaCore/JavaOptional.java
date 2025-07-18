package JavaCore;

import java.util.Optional;

import Practice.OOP.Model.Cat;

public class JavaOptional {
    public static void main(String[] args) {
        findUser("Denis");
    }

    private static Optional<Cat> findUser(String name) {
        Cat cat = new Cat();
        return Optional.ofNullable(cat);
    }
}
