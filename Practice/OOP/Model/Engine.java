package Practice.OOP.Model;

public class Engine {
    public String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Двигатель заведён");
    }

    public void stop() {
        System.out.println("Вы заглушили двигатель");
    }
}
