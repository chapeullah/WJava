package JavaCore.JavaExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

import JavaCore.JavaString;

public class JavaExceptions {
    public static void main(JavaString[] args) {
        // try-with-resources
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch (InputMismatchException e) {
            System.out.println("Ошибка: Неверный формат ввода");
        }
        catch (Exception e) {
            System.out.println("Ошибка: Что-то пошло не так");
            e.printStackTrace();
            return;
        }
        finally {
            System.out.println("Сканнер закрывается");
        }
        System.out.println("Пока");
    }
}