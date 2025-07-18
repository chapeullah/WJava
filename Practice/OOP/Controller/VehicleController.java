package Practice.OOP.Controller;

import Practice.OOP.Model.Bike;
import Practice.OOP.Model.Boat;
import Practice.OOP.Model.Car;
import Practice.OOP.Model.Vehicle;

public class VehicleController {
    public static void main(String[] args) {
        Car car = new Car();
        Boat boat = new Boat();
        Bike bike = new Bike();

        System.out.println(car.isRunning);
        car.start();
        System.out.println(car.isRunning);
        car.stop();
        car.start();
        car.drive();
        car.brake();

        car = new Car("Porsche", "Coyenne", 1999, 23000, "V8");

        System.out.println("\n" + car.engine.type);

        System.out.println();

        Vehicle[] vehicles = {car, boat, bike};
        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }
    }
}
