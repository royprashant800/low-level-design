package multithreading.readWriteLockLearning;

import java.util.concurrent.locks.ReadWriteLock;

//Shared Resource
public class SharedResource {
    boolean isAvailable = false;
    public void producer(ReadWriteLock lock) {
        try {
            lock.readLock().lock();
            System.out.println("read lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(5000);
        } catch (Exception e) {
            // TODO: handle exception
        }
        finally {
            lock.readLock().unlock();
            System.out.println("read lock released by: " + Thread.currentThread().getName());
        }
    }  
    public void consume(ReadWriteLock lock) {
        try {
            lock.writeLock().lock();
            System.out.println("write lock acquired by: " + Thread.currentThread().getName());
            isAvailable = false;
        } catch (Exception e) {
            // TODO: handle exception
        }
        finally {
            lock.writeLock().unlock();
            System.out.println("write lock released by: " + Thread.currentThread().getName());
        }
    }
}

