package Practice.OOP.Controller;

import java.util.Scanner;

import Practice.OOP.Model.Animal;
import Practice.OOP.Model.Cat;
import Practice.OOP.Model.Dog;
import Practice.OOP.Model.Fish;
import Practice.OOP.Model.Rabbit;
import Practice.OOP.Model.TalkingDog;

public class AnimalController {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();

        // RUNTIME POLYMORPHISM
        System.out.println("\nRuntime polymorphism");
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.print("\nТебе нравятся собаки или кошки? (1 = собаки, 2 = кошки, 0 = выход): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            Animal animal;
            switch (choice) {
                case 0 -> {
                    System.out.println("Вы выбрали: выход");
                    isRunning = false;
                }
                case 1 -> {
                    System.out.println("Вы выбрали: собаки\n");
                    animal = new Dog();
                    animal.speak();
                    isRunning = false;
                }
                case 2 -> {
                    System.out.println("Вы выбрали: кошки\n");
                    animal = new Cat();
                    animal.speak();
                    isRunning = false;
                }
                default -> {
                    System.out.println(choice + " не вариант выбора");
                }
            }
        }
        Dog dog1 = new Dog();
        
        // Анонимный класс
        Dog dog2 = new Dog() {
            @Override
            public void speak() {
                System.out.println("Скубиду на связи");
            }
        };
        TalkingDog talkingDog = new TalkingDog();
        dog1.speak();
        dog2.speak();
        talkingDog.speak();
        scanner.close();
    }
    
}