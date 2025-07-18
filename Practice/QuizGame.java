package Practice;

import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        int guess, result = 0;
        String[] questions = {
            "Какой будет результат выражения в Java?: 3 + 4 * 2",
            "Какой метод используется для добавления элемента в ArrayList",
            "Что делает оператор == при сравнении строк в Java?",
            "Какой тип данных предпочтителен для хранения дробного числа с плавающей точкой двойной точности?",
            "Какой модификатор доступа делает поле доступным только внутри своего класса?"
        };
        String[][] options = {
            {
                "1. 14", 
                "2. 11", 
                "3. 10", 
                "4. 7"
            },
            {
                "1. put()", 
                "2. append()", 
                "3. add()", 
                "4. insert()"
            },
            {
                "1. Сравнивает содержимое", 
                "2. Сравнивает ссылки", 
                "3. Сравнивает длины", 
                "4. Конкатенирует строки"
            },
            {
                "1. float", 
                "2. int", 
                "3. double", 
                "4. long"
            },
            {
                "1. public", 
                "2. protected", 
                "3. private", 
                "4. default"
            }
        };
        int[] answers = {2, 3, 2, 3, 3};
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Добро пожаловать в Java QUIZ Game! ===\n");
        for (int i = 0; i < questions.length; ++i) {
            System.out.println(questions[i] + "\n\nВарианты ответов:");
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Введите вариант ответа: ");
            guess = scanner.nextInt();
            scanner.nextLine();
            if (guess == answers[i]) {
                ++result;
                System.out.println("\n**********\nПРАВИЛЬНО!\n**********");
            } else {
                System.out.println("\n**********\nНЕ ПРАВИЛЬНО!\n**********");
            }
            System.out.println();
        }
        System.out.println("Ваш счёт " + result + " из 5 :)");
        scanner.close();
    } 
}