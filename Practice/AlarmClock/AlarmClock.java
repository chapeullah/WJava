package Practice.AlarmClock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) {

        final String audioPath = "Java/JavaCore/JavaIOAudioInput.wav";

        Scanner scanner = new Scanner(System.in);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        while (alarmTime == null) {
            try {
                System.out.print("\nВведите время будильника (HH:MM:SS): ");
                String inputTime = scanner.nextLine();
                alarmTime = LocalTime.parse(inputTime, formatter);
            }
            catch (Exception e) {
                System.out.println("Ошибка: Неверный формат ввода! Пожалуйста используйте HH:MM:SS");
            }
        }
        System.out.printf(
            "\nБудильник установлен на %02d:%02d:%02d\n", 
            alarmTime.getHour(), 
            alarmTime.getMinute(), 
            alarmTime.getSecond()
        );

        AlarmClockTask alarmTask = new AlarmClockTask(alarmTime, audioPath);
        Thread alarmThread = new Thread(alarmTask);
        alarmThread.start();
    
        scanner.close();
    }
}   