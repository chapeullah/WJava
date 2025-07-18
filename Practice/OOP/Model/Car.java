package Practice.OOP.Model;

public class Car implements Vehicle {
    public String make = "Ford";
    public String model = "Mustang";
    public int year = 2025;
    public double price = 58000.99;
    public boolean isRunning = false;
    public boolean isDriving = false;
    public Engine engine;

    public Car(String make, String model, int year, double price, String engineType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.engine = new Engine(engineType);
    }
    
    public Car() {

    }

    public void start() {
        isRunning = true;
        engine.start();
    }

    public void stop() {
        isRunning = false;
        System.out.println("Вы выключили двигатель");
    }

    public void drive() {
        if (isRunning) {
            System.out.println("Вы поехали " + make + " " + model);
            isDriving = true;
        }
        else {
            System.out.println("Автомобиль " + make + " " + model + " не заведён, невозможно поехать");
        }
    }
    
    public void brake() {
        if (isDriving) {
            System.out.println("Вы остановились " + make + " " + model);
            isDriving = false;
        } 
        else {
            System.out.println("Автомобиль " + make + " " + model + " не едет, невозможно остановиться");
        }
    }

    @Override
    public String toString() {
        return make + " " + model + " " + year;
    }

    @Override
    public void go() {
        System.out.println("Машина едет");
    }
}
