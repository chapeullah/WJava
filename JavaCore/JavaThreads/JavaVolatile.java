package JavaCore.JavaThreads;

public class JavaVolatile {

    // volatile - используется для того чтобы переменная менялась одновременно в каждом потоке
    public static volatile boolean running = true;

    public static void main(String[] args) {
        Thread.currentThread().setPriority(8);
        System.out.println(Thread.currentThread().getPriority());
        Thread.currentThread().setName("MAIN THREAD YO"); // Задаем имя потоку
        new Thread(() -> {
            Thread.currentThread().setName("Первый тред");
            System.out.println(Thread.currentThread().getName());
            while (running) {

            }
            System.out.println("Поток завершился");
        }).start();

        new Thread(() -> {
            Thread.currentThread().setName("Второй тред");
            System.out.println(Thread.currentThread().getName());
            while (running) {

            }
            System.out.println("Поток завершился");
        }).start();
        System.out.println(Thread.currentThread().isAlive());
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        try { 
            Thread.sleep(1000); 
        } 
        catch (InterruptedException e) {
            System.out.println("Поймали");
        }
        running = false;

    }
}
