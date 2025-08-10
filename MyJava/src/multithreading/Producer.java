package multithreading;

public class Producer implements Runnable {
    SharedResorce sharedResorce;

    Producer(SharedResorce resource) {
        this.sharedResorce = resource;
    } 

    public void run() {
        System.out.println("Producer thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            // handle exception
        }
        sharedResorce.addItem();
    }
}
