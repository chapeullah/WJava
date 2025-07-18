package Practice.OOP.Model;

public class Dog extends Animal {
    int lives = 1;

    @Override
    public void speak() {
        System.out.println("Собака лает");
    }
}
