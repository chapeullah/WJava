package Practice;

import java.util.Scanner;

public class FindHepotenuse {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a, b, c;
        System.out.print("Введите длину стороны A (см): ");
        a = scanner.nextDouble();

        System.out.print("Введите длину стороны B (см): ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("\nДлина гепотенузы (сторона C): " + c + "см");

        scanner.close();

    }  

}