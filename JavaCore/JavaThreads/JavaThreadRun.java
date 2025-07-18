package JavaCore.JavaThreads;

import java.util.Scanner;

public class JavaThreadRun {
    public static void main(String[] args) {
        String name;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("У вас есть 5 секунд чтобы ввести свое имя\nВведите ваше имя: ");
            JavaThreadRunTask task = new JavaThreadRunTask();
            Thread thread = new Thread(task);
            thread.setDaemon(true);
            thread.start();
            new Thread(() -> {
                try {
                    Thread.sleep(3000);
                } 
                catch (Exception e) {

                }
                System.out.println("Пошел от сюда");
            }).start();
            name = scanner.nextLine();
        }
        System.out.println("Привет, " + name + "!");
    }
}   