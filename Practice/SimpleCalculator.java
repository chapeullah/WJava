package Practice;

import java.util.Scanner;

public class SimpleCalculator {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1, num2, result;
        char operator;

        System.out.print("Введите первое число: ");
        num1 = scanner.nextDouble();

        System.out.print("Введите оператор (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Введите второе число: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Ошибка: Нельзя делить на 0!");
                    scanner.close();
                    return;
                }
                result = num1 / num2;
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                result = Double.NaN;
                System.out.println("Ошибка: Неправильный оператор");
                scanner.close();
                return;
            }
        }

        System.out.println("Ответ: " + result);

        scanner.close();
        
    }  

}