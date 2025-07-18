package Practice;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Random random = new Random();
    private static int number = random.nextInt(1, 101);

    public static void main(String[] args) {
        System.out.println("\nДобро пожаловать в игру «Угадай число»!");
        System.out.println("Я загадал число от 1 до 100.");
        System.out.println("У тебя есть 5 попыток, чтобы угадать правильное ч" + 
            "исло.");
        difficultySelection();
        scanner.close();
    }

    private static void difficultySelection() {
        int difficulty = -1;
        while (difficulty == -1) {
            System.out.print("\nВыбери уровень сложности:\n1. Легкий (10 попы" + 
                "ток)\n2. Средний (5 попыток)\n3. Сложный (3 попытки)\n\nВвед" + 
                "ите свой выбор: ");
            try {
                difficulty = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("Ошибка: неверный формат ввода");
                difficulty = -1;
                continue;
            }
            finally {
                scanner.nextLine();
                System.out.println();
            }
            switch (difficulty) {
                case 1 -> {
                    System.out.println("Отлично! Ты выбрал уровень сложности " + 
                        "— Легкий.\nНачнем игру!\n");
                    startGame(10);
                }
                case 2 -> {
                    System.out.println("Отлично! Ты выбрал уровень сложности " + 
                        "— Средний.\nНачнем игру!\n");
                    startGame(5);
                }
                case 3 -> {
                    System.out.println("Отлично! Ты выбрал уровень сложности " + 
                        "— Сложный.\nНачнем игру!\n");
                    startGame(3);
                }
                default -> {
                    System.out.println("Ошибка: " + difficulty + " не являетс" + 
                        "я вариантом выбора.\n");
                    difficulty = -1;
                }
            }
        }
    }

    private static void startGame(int difficulty) {
        boolean isUserWon = false;
        int attempts = 1;
        while (attempts <= difficulty && !isUserWon) {
            int input = -1;
            while (input == -1) {
                System.out.print("Введите вашу догадку: ");
                try {
                    input = scanner.nextInt();
                    if (input < 1 || input > 100) {
                        System.out.println("Ошибка: число не может быть меньш" + 
                            "е 1 или больше 100\n");
                        input = -1;
                        continue;
                    }
                }
                catch (InputMismatchException e) {
                    System.out.println("Ошибка: неверный формат ввода\n");
                    input = -1;
                    continue;
                }
                finally {
                    scanner.nextLine();
                }

                if (number == input) {
                    System.out.printf("Поздравляем! Ты угадал число с %d-й по" + 
                        "пытки.\n\n", attempts);
                    isUserWon = true;
                    return;
                }
                else if (number < input) {
                    System.out.printf("Неправильно! Загаданное число меньше %" +
                        "d.\n\n", input);
                    ++attempts;
                }
                else if (number > input) {
                    System.out.printf("Неправильно! Загаданное число больше %" + 
                        "d.\n\n", input);
                    ++attempts;
                }
            }
        }
        System.out.println("Игра окончена. Вы не смогли угадать число. Правил" + 
            "ьный ответ: " + number + ".");
    }
}
