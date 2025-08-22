package multithreading;

public class Consumer implements Runnable {
    SharedResorce sharedResorce;

    Consumer(SharedResorce resource) {
        this.sharedResorce = resource;
    } 

    @Override
    public void run() {
        System.out.println("Consumer thread: " + Thread.currentThread().getName());
        
        sharedResorce.consumeItem();
    }
}
