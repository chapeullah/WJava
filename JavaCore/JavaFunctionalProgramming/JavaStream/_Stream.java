package JavaCore.JavaFunctionalProgramming.JavaStream;

import static JavaCore.JavaFunctionalProgramming.JavaStream._Stream.Gender.*;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", MALE),
            new Person("Denis", MALE),
            new Person("Alex", MALE),
            new Person("Alice", FEMALE),
            new Person("Marina", FEMALE),
            new Person("Nastya", FEMALE),
            new Person("Bob", PREFER_NOT_TO_SAY)
        );
        people.stream()
            .map(person -> person.gender)
            .collect(Collectors.toSet())
            .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person [name=" + name + ", gender=" + gender + "]";
        }

        
    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }

}