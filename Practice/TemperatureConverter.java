package Practice;

import java.util.Scanner;

public class TemperatureConverter {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Введите температуру: ");
        temp = scanner.nextDouble();

        System.out.print("Конвертировать в Цельсии или Фаренгейты? (eng C or F): ");
        unit = scanner.next();

        newTemp = (unit.equalsIgnoreCase("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("Температура равна %.2f\n", newTemp);

        scanner.close();
        
    }  

}