package Practice;

import java.util.Scanner;

public class ShoppingCart {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String name;
        double cost;
        int count;

        System.out.print("Посчитать сумму\nВведите название товара: ");
        name = scanner.nextLine();
        System.out.print("Введите стоимость товара (с плав. точкой): ");
        cost = scanner.nextDouble();
        System.out.print("Введите кол-во товара: ");
        count = scanner.nextInt();

        System.out.println("Вы купили товар " + name + " в кол-ве " + count + " по цене " + count * cost + " руб!");

        scanner.close();

    }   

}   