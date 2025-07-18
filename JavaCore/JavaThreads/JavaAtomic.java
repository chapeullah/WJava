package JavaCore.JavaThreads;

import java.util.concurrent.atomic.AtomicInteger;

public class JavaAtomic {

    private static AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) {
        threadPattern();
    }

    public static void threadPattern() {
        do {
            count.set(0);;
            Thread t2 = new Thread(() -> {
                for (int i = 0; i < 5; ++i) {
                    count.incrementAndGet();
                }
            });

            Thread t1 = new Thread(() -> {
                for (int i = 0; i < 5; ++i) {
                    count.incrementAndGet();
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

            System.out.println(count.get());
        }
        while (count.get() == 10);
    }
}
