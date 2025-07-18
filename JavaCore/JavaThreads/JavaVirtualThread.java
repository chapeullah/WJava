package JavaCore.JavaThreads;

public class JavaVirtualThread {
    public static void main(String[] args) {
        Thread virtualThread = Thread.startVirtualThread(() -> {
            Thread.currentThread().setName("VirtualThread-1");
            System.out.println("1. getName(): " + Thread.currentThread().getName());
            try {
                for (int i = 5; i > 0; --i) {
                    System.out.println(i);
                    Thread.sleep(1000);
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                System.out.println("\rDone!");
            }
        });

        Thread virtualThread1 = Thread.startVirtualThread(() -> {
            Thread.currentThread().setName("VirtualThread-2");
            System.out.println("2. getName(): " + Thread.currentThread().getName());
            System.out.println("toString(): " + Thread.currentThread().toString());
        });

        // Еще такой способ создать виртуальный поток с заданием имени
        Thread virtualThread2 = Thread.ofVirtual().name("VT1").start(() -> {
            System.out.println("VT1: " + Thread.currentThread().getName());
        });

        virtualThread1.start();
        virtualThread2.start();

        try {
            virtualThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
