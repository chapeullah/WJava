package Practice.HangmanGame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {

    public static void main(String[] args) {
        // JAVA HAGMAN GAME
        String filePath = "Java/HangmanGame.txt";
        ArrayList<String> words = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Random random = new Random();
        String word = words.get(random.nextInt(words.size()));

        try(Scanner scanner = new Scanner(System.in)) {
            
            ArrayList<Character> wordState = new ArrayList<>();
            int wrongGuesses = 0, tries = 6;
            for (int i = 0; i < word.length(); ++i) {
                wordState.add('_');
            }
            System.out.println("\nДобро пожаловать в игру Java Hangman!\n");
            while (wrongGuesses < tries) {
                System.out.print("Слово: ");
                int wordStateSize = wordState.size();
                for (int i = 0; i < wordStateSize; ++i) {
                    System.out.print(wordState.get(i) + ((i == wordStateSize - 1) ? "" : " "));
                }
                System.out.println();
                System.out.print("Введите букву (а-я): ");
                char guess = scanner.nextLine().toLowerCase().charAt(0);
                if (word.indexOf(guess) >= 0) {
                    System.out.println("Правильный ответ");
                    for (int i = 0; i < wordStateSize; ++i) {
                        if (word.charAt(i) == guess) {
                            wordState.set(i, guess);
                        }
                    }
                    if (!wordState.contains('_')) {
                        System.out.println(getHangmanArt(wrongGuesses) + "ВЫ ВЫИГРАЛИ!\nСлово было: " + word);
                        break;
                    }
                } 
                else {
                    System.out.println("Не правильный ответ");
                    ++wrongGuesses;
                    System.out.print(getHangmanArt(wrongGuesses));
                }
            }
            if (wrongGuesses >= tries) {
                System.out.println(getHangmanArt(wrongGuesses) + "\nВы проиграли!\nСлово было: " + word);

            }
        }
    }

    public static String getHangmanArt(int wrongGuesses) {
        return switch (wrongGuesses) {
            case 0 -> "   \n   \n   \n";
            case 1 -> " o \n   \n   \n";
            case 2 -> " o \n | \n   \n";
            case 3 -> " o \n/| \n   \n";
            case 4 -> " o \n/|\\\n   \n";
            case 5 -> " o \n/|\\\n/  \n";
            case 6 -> " o \n/|\\\n/ \\\n";
            default -> "";
        };
    }

}