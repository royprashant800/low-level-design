package multithreading.stampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    boolean isAvailable = false;
    StampedLock lock = new StampedLock();

    public void producer() {
        long stamp = lock.readLock();
        try {
            System.out.println("read lock acquired by:-" + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(10000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        finally {
            lock.unlockRead(stamp);
            System.out.println("read lock released by:-" + Thread.currentThread().getName());
        }
    }
    public void consume() {
        long stamp = lock.writeLock();
        try {
            System.out.println("Write lock acquired by:- " + Thread.currentThread().getName());
            isAvailable = false;
        } catch (Exception e) {
            // TODO: handle exception
        }
        finally {
            lock.unlockWrite(stamp);
            System.out.println("write lock released by:-" + Thread.currentThread().getName());
        }
    }
}
