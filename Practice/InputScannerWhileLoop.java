package Practice;

import java.util.Scanner;

public class InputScannerWhileLoop {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        while (input.isEmpty()) {
            System.out.println("Строка не может быть пустой");
            System.out.print("Введите строку: ");
            input = scanner.nextLine();
        }

        System.out.println("Ваша строка: " + input);

        scanner.close();
        
    }  

}