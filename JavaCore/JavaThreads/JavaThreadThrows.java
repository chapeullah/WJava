package JavaCore.JavaThreads;

public class JavaThreadThrows {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 3; i > 0; --i) {
            System.out.printf("\r%d", i);
            Thread.sleep(1000);
        }
        System.out.print("\rDone!");
    }
}
