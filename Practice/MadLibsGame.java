package Practice;

import java.util.Scanner;

public class MadLibsGame {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.print("Опишите место где вы были (красивом, маленьком): ");
        adjective1 = scanner.nextLine();
        System.out.print("Введите что вы видели (человек, животное): ");
        noun1 = scanner.nextLine();
        System.out.print("Опишите каким было то что вы видели (красивым, маленьким): ");
        adjective2 = scanner.nextLine();
        System.out.print("Что делало то что вы видели (шло, лежало): ");
        verb1 = scanner.nextLine();
        System.out.print("Опишите ваше состояние (в ахуе, ошеломлён): ");
        adjective3 = scanner.nextLine();

        System.out.println("\nСегодня я был в " + adjective1 + " кинотеатре.");
        System.out.println("На удивление, там был(а) " + noun1 + ".");
        System.out.println(noun1.substring(0, 1).toUpperCase() + noun1.substring(1) + " был(а) " + adjective2 + " и " + verb1 + "!");
        System.out.println("Я был " + adjective3 + "!");

        scanner.close();

    }   

}   