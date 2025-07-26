package JavaCore.JavaFunctionalProgramming.JavaStream;

import static JavaCore.JavaFunctionalProgramming.JavaStream._Stream.Gender.*;

import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", MALE, 22),
            new Person("Denis", MALE, 25),
            new Person("Alex", MALE, 30),
            new Person("Alice", FEMALE, 20),
            new Person("Marina", FEMALE, 18),
            new Person("Nastya", FEMALE, 27),
            new Person("Bob", PREFER_NOT_TO_SAY, 90)
        );
        people.stream()
            .map(person -> person.gender)
            .collect(Collectors.toList())
            .forEach(System.out::println);

        people.stream()
            .map(person -> person.name)
            .forEach(name -> System.out.println(name));

        List<Integer> ages = people.stream()
            .map(person -> person.age)
            .collect(Collectors.toList());
        System.out.println(ages);

        people.stream()
            .map(person -> person.name.length())
            .forEach(System.out::println);
        
        boolean onlyFemales = people.stream()
            .allMatch(person -> person.gender.equals(Gender.FEMALE));
        System.out.println(onlyFemales);

        boolean anyFemales = people.stream()
            .anyMatch(person -> person.gender.equals(Gender.PREFER_NOT_TO_SAY));
        System.out.println(anyFemales);

        boolean noneFemales = people.stream()
            .noneMatch(person -> person.gender.equals(Gender.TRANSGENDER));
        System.out.println(noneFemales);
    }

    static class Person {
        private final String name;
        private final Gender gender;
        private final int age;

        Person(String name, Gender gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person [name=" + name + ", gender=" + gender + "]";
        }

        
    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY, TRANSGENDER
    }

}