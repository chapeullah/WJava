package JavaCore;

import java.util.Timer;
import java.util.TimerTask;

public class JavaTimertasks {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask(){

            int count = 3;

            @Override
            public void run(){
                --count;
                System.out.println("Hello!");
                if (count <= 0) {
                    System.out.println("Task complete!");
                    timer.cancel();
                }
            }
        };
        timer.schedule(timerTask, 1000, 1000);
    }
}   