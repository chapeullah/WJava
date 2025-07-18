package Practice;

import java.util.Scanner;

public class WeightConverter {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight;
        double convertedWeight;
        int choice;

        System.out.println("Программа перевода веса");
        System.out.println("1: Конвертировать фунты в килограммы");
        System.out.println("2: Конвертировать килограммы в фунты");

        System.out.print("Выбери опцию: ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Введите вес в фунтах: ");
            weight = scanner.nextDouble();
            convertedWeight = weight * 0.453592;
            System.out.printf("Вес в килограммах равен %.2f\n", convertedWeight);
        } else if (choice == 2) {
            System.out.print("Введите вес в килограммах: ");
            weight = scanner.nextDouble();
            convertedWeight = weight * 2.20462;
            System.out.printf("Вес в фунтах равен %.2f\n", convertedWeight);
        } else {
            System.out.println("Ошибка! Можно выбрать только 1 или 2");
        }

        scanner.close();
        
    }  

}