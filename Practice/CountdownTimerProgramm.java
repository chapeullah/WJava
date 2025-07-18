package Practice;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountdownTimerProgramm {
    public static void main(String[] args) {
        Timer timer = new Timer();
        int response;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите кол-во секунд для таймера: ");
            response = scanner.nextInt();
            scanner.nextLine();
        }
        TimerTask timerTask = new TimerTask() {
            int count = response;
            @Override
            public void run() {
                System.out.println(count);
                --count;
                if (count <= 0) {
                    System.out.println("Таймер закончился!");
                    timer.cancel();
                }
            }
        };
        timer.schedule(timerTask, 0, 1000);
    }
}   