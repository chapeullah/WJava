package Practice.OOP.Model;

public abstract class Animal {
    public Animal() {
        this.isAlive = true;
    }

    void eat() {
        System.out.println("Животное ест");
    }

    void move() {
        System.out.println("Животное двигается");
    }

    public abstract void speak();

    public boolean isAlive;
}
