package Practice.OOP.Controller;

import Practice.OOP.Model.Circle;
import Practice.OOP.Model.Rectangle;
import Practice.OOP.Model.Triangle;

public class ShapeController {
    public static void main(String[] args) {
        Circle circle = new Circle(20);
        Triangle triangle = new Triangle(10, 5);
        Rectangle rectangle = new Rectangle(15, 5);
        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
  