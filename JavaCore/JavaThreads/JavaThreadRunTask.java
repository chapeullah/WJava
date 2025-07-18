package JavaCore.JavaThreads;

public class JavaThreadRunTask implements Runnable {
    
    @Override
    public void run() {
        for (int i = 0; i <= 5; ++i) {
            try {
                Thread.sleep(1000);
            } 
            catch (Exception e) {
                System.out.println("Что-то пошло не так!");
            }
            if (i == 5) {
                System.out.println("\nВремя закончилось!");
                System.exit(0);
            }
        }
    }

}
