package Practice.OOP.Model;

public abstract class Shape {
    protected abstract double area();
    protected void display() {
        System.out.println("Это фигура");
    }
}
