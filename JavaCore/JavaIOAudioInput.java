package JavaCore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class JavaIOAudioInput {
    public static void main(String[] args) {
        String filePath = "Java/JavaCore/JavaIOAudioInput.wav";
        File file = new File(filePath);
        try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(file);
            Scanner scanner = new Scanner(System.in)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            System.out.println("Успешно: Проблем не обнаружено");
            String response = "";
            while (!response.equals("Q")) {
                System.out.println("""

                        P = Play
                        S = Stop
                        R = Reset
                        Q = Quit
                        """
                    );
                System.out.print("Введите ваш выбор: ");
                response = scanner.nextLine().toUpperCase();
                switch (response) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Неверный формат ввода выбора");
                }
            }
        
        }
        catch (FileNotFoundException e) {
            System.out.println("Ошибка: Невозможно найти файл");
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("Ошибка: Неподдерживаемый аудио файл");
        }
        catch (LineUnavailableException e) {
            System.out.println("Ошибка: Невозможно получить доступ к аудио");
        }
        catch (Exception e) {
            System.out.println("Ошибка: Что-то пошло не так!");
        }
        finally {
            System.out.println("Пока");
        }
    }
}