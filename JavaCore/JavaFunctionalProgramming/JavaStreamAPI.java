package JavaCore.JavaFunctionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaStreamAPI {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", Gender.MALE),
            new Person("Denis", Gender.MALE),
            new Person("Alex", Gender.MALE),
            new Person("Alice", Gender.FEMALE),
            new Person("Marina", Gender.FEMALE),
            new Person("Nastya", Gender.FEMALE)
        );

        // imperative approach
        System.out.println("\n// imperative approach");
        List<Person> females = new ArrayList<>();
        List<Person> males = new ArrayList<>();
        for (Person person : people) {
            if (person.gender.equals(Gender.FEMALE)) {
                females.add(person);
            }
            else {
                males.add(person);
            }
        }
        System.out.println("females = " + females);
        System.out.println("males = " + males);
        

        // declarative approach
        System.out.println("\n// declarative approach");

        // .forEach(System.out::println) - сразу выводим в консоль
        people.stream()
            .filter(person -> person.gender.equals(Gender.FEMALE))
            .forEach(System.out::println);

        // .collect(Collectors.toList()) - записываем в List<Person>
        List<Person> femaleList = people.stream()
            .filter(person -> person.gender.equals(Gender.FEMALE))
            .collect(Collectors.toList());
        System.out.println();
        femaleList.forEach(System.out::println);
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
        MALE, FEMALE
    }
}
