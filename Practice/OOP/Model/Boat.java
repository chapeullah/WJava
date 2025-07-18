package Practice.OOP.Model;

public class Boat implements Vehicle {
    String name;
    static int boatCount;

    // БЛОК ИНИЦИАЛИЗАЦИИ
    {
        name = "boat";
    }

    // БЛОК ИНИЦИАЛИЗАЦИИ (СТАТИЧЕСКИЙ)
    static {
        boatCount = 0;
    }

    public Boat() {
        ++boatCount;
    }

    public Boat(String name) {
        this.name = name;
        ++boatCount;
    }

    @Override
    public void go() {
        System.out.println("Лодка плывёт");
    }
}
