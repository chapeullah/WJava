package Practice.AlarmClock;

import java.time.LocalTime;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import java.awt.Toolkit;
import java.io.File;

public class AlarmClockTask implements Runnable {

    private final LocalTime alarmTime;
    private final String audioPath;

    AlarmClockTask(LocalTime alarmTime, String audioPath) {
        this.alarmTime = alarmTime;
        this.audioPath = audioPath;
    }

    @Override
    public void run() {
        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) {
                System.out.println("Ошибка потока");
            }
            LocalTime now = LocalTime.now();

            System.out.printf(
                "\r%02d:%02d:%02d", 
                now.getHour(), 
                now.getMinute(), 
                now.getSecond()
            );
        }
        LocalTime now = LocalTime.now();
        System.out.printf(
            "\nБудильник: %02d:%02d:%02d\n", 
            now.getHour(), 
            now.getMinute(), 
            now.getSecond()
        );
        Toolkit.getDefaultToolkit().beep();
        playAudio();
    }

    private void playAudio() {
        File audioFile = new File(audioPath);
        try (AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            Thread.sleep(10000);
        }
        catch (Exception e) {
            System.out.println("Что-то пошло не так");
            e.printStackTrace();
        }
        
    }
}
