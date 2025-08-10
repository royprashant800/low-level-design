package multithreading.stampedLock;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread th1 = new Thread(() -> {
            resource.producer();
        });
        Thread th2 = new Thread(() -> {
            resource.producer();
        });

        SharedResource resource1 = new SharedResource();
        Thread th3 = new Thread(() -> {
            resource1.consume();
        });

        th1.start();
        th2.start();
        th3.start();
    }
}
