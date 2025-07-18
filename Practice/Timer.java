package Practice;

import java.util.Scanner;

public class Timer {
    
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner = new Scanner(System.in);

        int seconds;

        System.out.print("Таймер\nВведите кол-во секунд: ");
        seconds = scanner.nextInt();

        for (int i = seconds; i >= 0; --i) {
            System.out.println(i);
            Thread.sleep(1000);
        }

        scanner.close();
        
    }  

}