package example3;

public class Example3 {

    public static void main(String[] args) throws InterruptedException {
        Thread counter = new Thread(new CountingTask());
        counter.start();
        Thread.sleep(5000L);
        counter.interrupt();
        counter.join();
    }
}
