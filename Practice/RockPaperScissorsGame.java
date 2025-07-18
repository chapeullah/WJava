package Practice;

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] choices = {"камень", "ножницы", "бумага"};
        int playAgain = -1;
        int computerChoice;
        System.out.println("=== Игра: камень, ножницы, бумага ===");
        do {
            int playerChoice = -1;
            playAgain = -1;
            while (playerChoice == -1) {
                System.out.print("\n1. Камень\n2. Ножницы\n3. Бумага\nВведите ваш выбор (1, 2, 3; для выхода введите 0): ");
                playerChoice = scanner.nextInt();
                scanner.nextLine();
                System.out.println();
                switch (playerChoice) {
                    case 1, 2, 3 -> {
                        System.out.println("Ваш выбор: " + choices[playerChoice - 1]);
                    }
                    case 0 -> {
                        System.out.println("Завершение программы");
                        return;
                    }
                    default -> {
                        System.out.println("ОШИБКА! " + playerChoice + " не является вариантом выбора");
                        playerChoice = -1;
                    }
                }
            }
            computerChoice = random.nextInt(1, 4);
            System.out.println("Выбор компьютера: " + choices[computerChoice - 1]);
            System.out.println("\n********");
            if (playerChoice == computerChoice) {
                System.out.println("Ничья :|");
            } else if (
                playerChoice == 1 && computerChoice == 2 ||
                playerChoice == 2 && computerChoice == 3 ||
                playerChoice == 3 && computerChoice == 1
            ) {
                System.out.println("Вы выиграли! :)");
            } else {
                System.out.println("Вы проиграли! :(");
            }
            System.out.println("********\n");
            while (playAgain == -1) {
                System.out.print("Хотите сыграть еще раз?\n1. Да\n2. Нет\nВведите ваш выбор (1/2): ");
                playAgain = scanner.nextInt();
                scanner.nextLine();
                switch (playAgain) {
                    case 1 -> System.out.println("Вы выбрали: Да");
                    case 2 -> System.out.println("Вы выбрали: Нет");
                    default -> {
                        System.out.println("ОШИБКА! " + playAgain + " не вариант выбора");
                        playAgain = -1;
                    }
                }
            }
        } while (playAgain == 1);
        System.out.println("Спасибо за игру!");
        scanner.close();
    } 
}