package JavaCore;

class JavaMultithreadTask implements Runnable {

    private final String text;
    JavaMultithreadTask(String text) {
        this.text = text;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; ++i) {
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " " + text + " " + i);
            } 
            catch (InterruptedException e) {
                System.out.println("Ошибка потока");
            }
        }
    }
}