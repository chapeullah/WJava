package Practice.OOP.Model;

public class Fish extends Animal implements Predator, Prey {
    @Override
    public void move() {
        System.out.println("Животное плывёт");
    }

    @Override
    public void flee() {
        System.out.println("Рыба уплывает");
    }

    @Override
    public void hunt() {
        System.out.println("Рыба охотится");
    }

    @Override
    public void speak() {
        System.out.println("Рыба булькает");
    }
}
