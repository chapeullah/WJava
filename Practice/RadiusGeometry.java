package Practice;

import java.util.Scanner;

public class RadiusGeometry {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Введите радиус (см): ");
        radius = scanner.nextDouble();
        
        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = (4.d / 3.d) * Math.PI * Math.pow(radius, 3);

        System.out.println("Периметр окружности: " + circumference + " см");
        System.out.println("Площадь окружонсти: " + area + " см^2");
        System.out.println("Объем сферы: " + volume + " см^3\n");

        System.out.printf("Периметр окружности: %.1f см\n", circumference);
        System.out.printf("Площадь окружности: %.1f см^2\n", area);
        System.out.printf("Объем сферы: %.1f см^3\n", volume);

        scanner.close();

    }  

}