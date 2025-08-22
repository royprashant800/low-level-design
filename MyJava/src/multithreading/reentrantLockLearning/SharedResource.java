package multithreading.reentrantLockLearning;

import java.util.concurrent.locks.ReentrantLock;

//Shared Resource
public class SharedResource {
    boolean isAvailable = false;
    ReentrantLock lock = new ReentrantLock();
    
    public void producer() {
        try {
            lock.lock();
            System.out.println("Lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception e) {
            // TODO: handle exception
        } 
        finally {
            lock.unlock();
            System.out.println("lock released by: " + Thread.currentThread().getName());
        }
    }
}