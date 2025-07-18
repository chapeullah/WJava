package JavaCore;

public class JavaMultithread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new JavaMultithreadTask("Пинг"));
        Thread thread2 = new Thread(new JavaMultithreadTask("Понг"));
        System.out.println("Игра началась!");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Игра закончилась! :)");
    }
}