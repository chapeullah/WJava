package JavaCore;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class JavaIOWriteFiles {
    public static void main(JavaString[] args) {
        String filePath = "Java/JavaCore/JavaIOWriteFiles.txt";
        String textContent = """
                Розы красные
                Ромашки жёлто-белые
                Красиво-красиво-красиво
                """;
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(textContent);
            System.out.println("Файл был записан");
        } 
        catch (FileNotFoundException e) {
            System.out.println("Ошибка: Неверно указан путь или имя файла");
        }
        catch (IOException e) {
            System.out.println("Ошибка: Невозможно записать файл");
        }
    }
}