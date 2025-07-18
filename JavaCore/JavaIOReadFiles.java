package JavaCore;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class JavaIOReadFiles {
    public static void main(String[] args) {
        String filePath = "Java/JavaCore/JavaIOWriteFiles.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while (((line  = bufferedReader.readLine()) != null)) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Ошибка: невозможно найти файл");
        }
        catch (IOException e) {
            System.out.println("Ошибка: Что-то пошло не так");
        }
    }
}