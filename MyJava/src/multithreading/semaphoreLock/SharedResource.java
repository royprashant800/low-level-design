package multithreading.semaphoreLock;

import java.util.concurrent.Semaphore;

public class SharedResource {
    boolean isAvailable = false;
    Semaphore lock = new Semaphore(2);

    public void producer() {
        try {
            lock.acquire();
            System.out.println("lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(6000);
        } catch (Exception e) {
            // handle exception
        }
        finally {
            System.out.println("lock released by: " + Thread.currentThread().getName());
        }   
    }
}
