package JavaCore.JavaThreads;

public class JavaSynchronized {

    private static final Object lock2 = new Object();
    private static final Object lock1 = new Object();
    
    private static volatile int count;

    public static void main(String[] args) {
        threadPattern();
    }

    public static void threadPattern() { 
        lock2.getClass();
        do {
            count = 0;
            Thread t2 = new Thread(() -> {
                for (int i = 0; i < 5; ++i) {
                    synchronized (lock1) {
                        count++;
                    }
                }
            });

            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 5; ++i) {
                    synchronized (lock1) {
                        count++;
                    }
                }
            });

            t1.start();
            t2.start();

            try {
                t1.join();
                t2.join();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(count);
        }
        while (count == 10);
    }

    // Метод антипаттерн (причина нужды в synchronized)
    public static void threadAntipattern() {
        do {
            count = 0;
            Thread t2 = new Thread(() -> {
                for (int i = 0; i < 5; ++i) {
                    count++;
                }
            });

            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 5; ++i) {
                    count++;
                }
            });

            t1.start();
            t2.start();

            try {
                t1.join();
                t2.join();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(count);
        }
        while (count == 10);
    }
}
