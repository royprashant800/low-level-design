package multithreading;

public class SharedResorce {
    boolean itemAvailable = false;

    public synchronized void addItem() {
        itemAvailable = true;
        System.out.println("Item added by: " + Thread.currentThread().getName() + " and invoking all the threads which are waiting");
        notifyAll();
    }

    public synchronized void consumeItem() {
        System.out.println("Consumeditem method invoked by: " + Thread.currentThread().getName());

        //using while loop to avoid spurious wake-up, sometimes coz of system noise
        while (!itemAvailable) {
            try {
                System.out.println("Thread " + Thread.currentThread().getName() + " is waiting now");
                wait();
            } catch(Exception e) {
                //
            }
        }

        System.out.println("Item consumed by: " + Thread.currentThread().getName());
        itemAvailable = false;
    }
}

class Main {
    public static void main(String[] args) {
        // System.out.println("Main method start");

        // SharedResorce sharedResorce = new SharedResorce();
        // Thread producerThread = new Thread(new Producer(sharedResorce));
        // Thread consumerThread = new Thread(new Consumer(sharedResorce));

        // producerThread.start();
        // consumerThread.start();

        // System.out.println("main method end");
        
    }
}