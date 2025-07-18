package Practice;

import java.util.Scanner;

public class CompoundCalculator {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int times;
        int years;
        double result;

        System.out.print("Введите основную сумму долга: ");
        principal = scanner.nextDouble();

        System.out.print("Введите процентную ставку (в %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Введите количество начислений за год: ");
        times = scanner.nextInt();

        System.out.print("Введите количество лет: ");
        years = scanner.nextInt();

        result = principal * Math.pow(1 + rate / times, times * years);
        System.out.println("\nФинальный итог: " + result);
        
        scanner.close();
        
    }  

}